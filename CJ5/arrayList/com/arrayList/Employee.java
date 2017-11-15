package com.arrayList;

import java.util.Date;
import java.util.GregorianCalendar;


public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String aName, double aSalary, int year, int month, int day) {
        name = aName;
        salary = aSalary;
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        hireDay = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}