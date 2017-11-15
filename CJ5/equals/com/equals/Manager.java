package com.equals;


public class Manager extends Employee {

    private double bonus;
    public Manager(String aName, double aSalary, int year, int month, int day) {
        super(aName, aSalary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double salary = super.getSalary();
        return salary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }

    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        Manager other = (Manager) otherObject;
        return bonus == other.bonus;
    }

    public int hashCode() {
        return super.hashCode() + 17 * new Double(bonus).hashCode();
    }

    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}