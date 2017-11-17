package com.clone;

import java.util.*;


public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String aName, double aSalary) {
        name = aName;
        salary = aSalary;
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        hireDay = calendar.getTime();
    }



}