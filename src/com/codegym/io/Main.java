package com.codegym.io;

import java.util.Date;

public class Main {
        public static void main(String[] args) {
            Employee manh = new Employee(1,"Mạnh",new Date(97,5,23),100000);
            Employee dung= new Employee(2,"Mạnh",new Date(80,11,33),10556000);
            System.out.println(manh.getAge());
            System.out.println(dung.getAge());

            manh.CreaseSalary();
            dung.CreaseSalary();
            System.out.println("Lương của mạnh là: " + manh.getSalary());
            System.out.println("Lương của dũng là: " + dung.getSalary());
        }
    }
