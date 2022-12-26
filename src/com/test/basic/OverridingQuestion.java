package com.test.basic;

class Parent {
    public void fun(Float f) {
        System.out.println("In Float function");
    }

}

class OverridingQuestion extends Parent {
    public static void main(String args[]) {
        OverridingQuestion obj = new OverridingQuestion();
        obj.fun(2);
    }

    public void fun(Integer o) {
        System.out.println("In Integer function");
    }
}	
