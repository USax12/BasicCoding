package com.dsa.arrays;

import java.util.Scanner;

public class array_deletion {

    @SuppressWarnings("resource")
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int noOfElements,indexOfDeletedElement;
        System.out.println("Enter the number of elements:");
        noOfElements=scanner.nextInt();

        int a[] = new int[noOfElements];
        int b[] = new int[noOfElements-1];
        System.out.println("Enter the elements of the array:");
        for(int i= 0;i<noOfElements;i++){

            a[i]=scanner.nextInt();
        }
        System.out.println("Enter the  index of element to be deleted:");
        indexOfDeletedElement= scanner.nextInt();
        for(int i=0;i< noOfElements;i++){  // a[] =10 20 30 40 , indexOfDeletedElement =2
            if(i<indexOfDeletedElement){        //b[]=10 20
                b[i]=a[i];
            }
            else if( i== indexOfDeletedElement){
                continue;
            }
            else {
                b[i-1]=a[i];
                // if i matches the element to be deleted we skip that element so array b is one step behind than a
            }
        }
        System.out.println("The elements are:");
        for (int i = 0; i < noOfElements-1; i++) {
            System.out.println(b[i]);
        }


    }
}
