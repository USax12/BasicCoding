package com.test.basic;

class OverloadingQuestion {

    public static void main(String args[]) {
        OverloadingQuestion obj = new OverloadingQuestion();
        //obj.fun(null);    //refernce to fun is ambiguous

        String s = "abc";
        s = null;
        obj.fun(s); //String function

    }

    public void fun(Object o) {
        System.out.println("In Object function");
    }

    public void fun(Integer o) {
        System.out.println("In Integer function");
    }

    public void fun(String o) {
        System.out.println("In String function");
    }
}		