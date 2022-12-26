package com.test.string;

class LenghtOfString {
    public static void main(String args[]) {
        String name = "Utkarsh Saxena";
        int len = 0;
        char ch[] = name.toCharArray();
        for (char c : ch) {
            len++;
        }
        System.out.println("Length " + len);

    }
}


/****	using StringIndexOutOfBoundsException

 class LenghtOfStringMain{

 public static void main(String args[]){

 String helloWorld="This is hello world";
 System.out.println("length of helloWorld string :"+getLengthOfString(helloWorld));

 }

 public static int getLengthOfString(String str)
 {
 int i=0;
 try{
 for(i=0;;i++)
 {
 str.charAt(i);
 }

 }
 catch(Exception e)
 {

 }
 return i;
 }
 ***/