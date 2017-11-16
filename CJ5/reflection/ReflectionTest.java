import java.util.*;

import java.io.File;
import java.lang.reflect.*;


public class ReflectionTest {
    public static void main(String[] args) {
        String name;
        if (args.length > 0) {
            name = args[0];
        }
        else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date): ");
            name = in.next();
            System.out.println(name.getClass());
        }

        try {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }

            System.out.print("class" + name);

            if (supercl != null && supercl != Object.class) {
                System.out.print(" extends " + supercl.getName());
            }

            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printField(cl);
            System.out.println("}");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }


    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c: constructors) {
            String name = c.getName();
            System.out.print("    ");
            String modifiers = Modifier.toString(c.getModifiers());

            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }

            System.out.print(name + "(");

            Class[] paramsTypes = c.getParameterTypes();

            for (int i = 0; i < paramsTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramsTypes[i].getName());
            }
            System.out.println(");");
        }
    }


    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();

        for (Method m: methods) {
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.print("    ");
            String modifiers = Modifier.toString(m.getModifiers());

            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(retType.getName() + " " + name + "(");

            Class[] paramTypes = m.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }


    public static void printField(Class cl) {

        Field[] fields = cl.getDeclaredFields();

        for (Field f: fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("    ");
            String modifier = Modifier.toString(f.getModifiers());
            if (modifier.length() > 0) {
                System.out.print(modifier + " ");
            }
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}