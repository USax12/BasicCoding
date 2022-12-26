package com.test.oops;

class EnhancedForLoop {
    public static void main(String[] args) {

        int[] numbers = {3, 4, 5, -5, 0, 12};
        int sum = 0;
        // using for each loop
          /*for (int i: numbers) {
             sum += i;
          }
          */
        // using normal for loop
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(" Total Sum = " + sum);
    }
}