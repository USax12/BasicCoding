package com.test.basic;

class Base {


    public static void display() {
        System.out.println("Static or class method from Base");
    }


    public void print() {
        System.out.println("Non-static or Instance method from Base");
    }
}


class Derived extends Base {


    public static void display()        // This method hides display() in Base
    {
        System.out.println("Static or class method from Derived");
    }


    public void print()                // This method overrides print() in Base
    {
        System.out.println("Non-static or Instance method from Derived");
    }
}

// Driver class 
public class TestStaticOverride {
    public static void main(String args[]) {
        Base obj1 = new Derived();            //obj 1 refer to child class

        obj1.display();                // As per overriding rules it should call to class Derive's static overridden method. Since static method can not be  overridden, it  calls Base's display()  since static methods are resolved or bonded during compile time not runtime.
        Derived d = new Derived();
        d.display();

        //  Derived.display();
        // Here overriding works and Derive's print() is called
        obj1.print();
    }
} 