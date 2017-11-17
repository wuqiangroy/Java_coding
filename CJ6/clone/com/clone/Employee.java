package com.clone;

import java.util.*;


public class Employee implements Cloneable {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String aName, double aSalary) {
        name = aName;
        salary = aSalary;
        hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();

        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }

    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month-1, day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String toString() {
        return "Employee[name=" + name + ", salary=" + salary + ", date=" + hireDay + "]";
    }
}