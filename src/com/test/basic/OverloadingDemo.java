package com.test.basic;

class OverloadingDemo {

    public static void main(String args[]) {
        OverloadingDemo dm = new OverloadingDemo();
        dm.sum(5, 4f);    //Floating
        dm.sum(2, 3);    //Integer
        dm.sum(2, 2f);    //Floating
        dm.sum(2, 4);    //Integer
        dm.fun(2);        //Integer

    }

    public void sum(int a, int b) {
        System.out.println("Integer :" + a + "," + b);

    }

    public void sum(int a, float b) {
        System.out.println("Floating :" + a + b);

    }

    public void sum(int a, long b) {
        System.out.println("Long :");

    }

    public void fun(Float o) {
        System.out.println("In Float function");
    }

    public void fun(Integer o) {
        System.out.println("In Integer function");
    }
}	