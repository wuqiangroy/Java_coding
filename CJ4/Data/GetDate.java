import java.util.*;

public class GetDate {
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();
        GregorianCalendar deadline = new GregorianCalendar();
        int month = now.get(Calendar.MONTH); // current month
        int weekday = now.get(Calendar.DAY_OF_WEEK);
        System.out.println(weekday);

        deadline.set(Calendar.YEAR, 2016); // year
        deadline.set(Calendar.MONTH, Calendar.MARCH); // month
        deadline.set(Calendar.DAY_OF_MONTH, 11); // day
        // deadline.set(2001, Calendar.MARCH, 11)
        // System.out.println(deadline);
        System.out.println(Calendar.MARCH); // 2, it's month offset

        GregorianCalendar calendar = new GregorianCalendar();
        Date time = calendar.getTime();
        System.out.println(time.toString()); // Mon Nov 13 11:12:27 CST 2017

        GregorianCalendar d = new GregorianCalendar();
        d.set(Calendar.DAY_OF_MONTH, 1);
        int week = d.get(Calendar.DAY_OF_MONTH);
        System.out.println(week);
    }
}