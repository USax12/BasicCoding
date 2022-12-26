package com.test.basic;

interface m1 {
    public void method1();

    public void method2();
}

/*interface m2
{
	info();
}*/
abstract class myClass implements m1 {
    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    /*public void method2()
   {
    System.out.println("implementation of method2");
   }*/
    public abstract void methodAb();
}

class InterfaceDemo extends myClass {
    public static void main(String args[]) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.method2();
        obj.methodAb();

    }

    public void method2() {
        System.out.println("In method 2");
    }

    public void methodAb() {
        System.out.println("In methodAb");
    }
}
	