package com.test.oops;

class Animal {
    void bark() {
        System.out.println("Parent class");
    }
}

class Dog extends Animal {
    void child() {
        System.out.println("Child ");
    }

    void bark() {
        System.out.println("Child class");
    }
}

class TestInheritance {
    public static void main(String args[]) {
        Animal a = new Animal(); // parent class object
        Animal a1 = new Dog();    // parent class refernce holding child class object
        Dog d = new Dog();
        //Dog d1= new Animal(); //incompatible types : Animal cannot be converted to dog  [child class cannot]
        //Dog d1=(Dog)new Animal();    //Compiles successfully but ClassCastException is thrown at runtime
        a.bark();    // Parent class
        a1.bark();    // Child class
        d.bark();    // Child class
        //a.child(); //super class cannot access the derived class methods and data members

    }
}	
	
	