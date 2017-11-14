package com;


public class Manager extends Employee {
    private double bonus;
    /**
     * @param aName the employee's name
     * @param aSalary the employee's salary
     * @param year the hire year
     * @param month the hire month
     * @param day the hire day
     */

     public Manager(String aName, double aSalary, int year, int month, int day) {
         super(aName, aSalary, year, month, day);
         bonus = 0;
     }

     public double getSalary() {
         double baseSalary = super.getSalary();
         return baseSalary + bonus;
     }

     public void setBonus(double b) {
         bonus = b;
     }
}