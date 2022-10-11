package com.codegym.io;

import java.util.Date;

public class Employee {
    int id;
    String name;
    Date dob;
    double salary;
    public Employee (int id, String name, Date dob, double salary){
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public Date getDob(){
        return this.dob;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDob(Date dob){
        this.dob = dob;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public int getAge(){
        Date year = new Date();
        return year.getYear() - this.getDob().getYear();
    }
    public void CreaseSalary(){
        this.salary = this.salary + this.salary * 0.1;
    }
}
