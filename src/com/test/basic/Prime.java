package com.test.basic;

import java.util.Scanner;

class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int count = 0, a;
        for (int i = 1; i <= n; i++) {
            a = n % i;
            //System.out.println("mod of No:"+ n+"%"+i + "is" +a);
            if (a == 0)
                count++;
        }
        if (count == 2)
            System.out.println("Prime no");
        else
            System.out.println("Not Prime");
    }
}	
				