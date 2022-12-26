package com.test.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Student {
    private int id;
    private String name;

    Student(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Student))
            return false;
        if (obj == this)
            return true;
        return this.getId() == ((Student) obj).getId();
    }

    @Override
    public int hashCode() {
        return id;
    }
}


public class Contract {

    public static void main(String[] args) {

        Student alex1 = new Student(1, "Alex");
        Student alex2 = new Student(1, "Alex");
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
        /**
         * Although the two instances have exactly the same attribute values, they are stored in different
         * memory locations. Hence, they are not considered equal as per the default implementation of equals().
         * so we override the equals() method and two students are equal if they have the same ID.
         */

        //false if not overridden equals method as it checks memory address

        List<Student> st = new ArrayList<Student>();
        st.add(alex1);
        st.add(alex2);
        System.out.println("Arraylist size = " + st.size());

        System.out.println("Arraylist contains Alex = " + st.contains(new Student(1, "Alex")));


        HashSet<Student> hs = new HashSet<Student>();
        hs.add(alex1);
        hs.add(alex2);
        System.out.println("HashSet size = " + hs.size());
        //HashSet size = 2    after overriding  HashSet size = 1
        /*
         * if we do not override hashcode methods then size output is 2 whereas hashset
         * stores unique objects and alex1 and alex2 are equal according to equals()
         * method. he importance of overriding hashcode(), so let's override it in
         * Student and set it to be equal to the ID so that students who have the same
         * ID
         */
        System.out.println("HashSet contains Alex = " + hs.contains(new Student(1, "Alex")));


    }

}
