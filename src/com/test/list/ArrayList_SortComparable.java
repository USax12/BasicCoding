package com.test.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_SortComparable {

    public static void main(String[] args) {
        /*
         * ArrayList<String> Slist= new ArrayList<String>(); Slist.add("Alex");
         * Slist.add(1,"Harry"); Slist.add(2, "Stebin"); Slist.add(3, "Bob");
         * System.out.println("UnSorted"+Slist);
         * Slist.sort(Comparator.comparing(String::toString));
         * System.out.println("Sorted"+Slist);
         */
        ArrayList<Employee> arr = new ArrayList<Employee>();
        Employee e1 = new Employee(1, "Alex", 10, 10000);
        arr.add(e1);
        arr.add(new Employee(2, "Steben", 11, 20000));
        arr.add(new Employee(3, "Bob", 12, 30000));
        arr.add(new Employee(4, "Utkarsh", 25, 10000000));
        Collections.sort(arr);   // if employee class does not implement comparable then compile time error
        // method sort is not applicable for the arguments(ArrayList<T>employye)
        System.out.println(arr);
    }

}

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;
    private long salary;

    public Employee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {

        return name;
    }

    @Override
    public int compareTo(Employee o) {
        // TODO Auto-generated method stub
        //return this.name.compareTo(o.name);			//[Alex, Bob, Steben, Utkarsh]
        return (int) (this.salary - o.salary);        //[Alex, Steben, Bob, Utkarsh]
        //return (int) (o.salary-this.salary);  	//[Utkarsh, Bob, Steben, Alex]
    }

}