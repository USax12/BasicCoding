package com.test.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList_SortComparator {

    public static void main(String[] args) {

        ArrayList<Author> al = new ArrayList<Author>();
        al.add(new Author("Henry", "Tropic of Cancer", 45));
        al.add(new Author("Nalo", "Brown Girl in the Ring", 56));
        al.add(new Author("Frank", "300", 65));
        al.add(new Author("Deborah", "Sky Boys", 51));
        al.add(new Author("George R. R.", "A Song of Ice and Fire", 62));
        System.out.println("Before Sorting:" + al);
        //Before Sorting:[com.arrayList.Author@15db9742, com.arrayList.Author@6d06d69c,..
        //if we have not overriden tostring method
        Collections.sort(al);
        System.out.println("After Sorting:" + al);


        /*Sorting using BookNameComparator*/
        System.out.println("Sorting by Book Name:");
        Collections.sort(al, new BookNameComparator());
        System.out.println(al);

        System.out.println("Sorting by Author Age:");
        Collections.sort(al, new AgeComparator());
        System.out.println(al);
        /*  instead of printing here we will use toString method
         * for(Author au: al){
         * System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
         * au.getAuAge()); }
         */

    }

}

class Author implements Comparable<Author> {
    String firstName;
    String bookName;
    int auAge;

    Author(String first, String book, int age) {
        this.firstName = first;
        this.bookName = book;
        this.auAge = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getAuAge() {
        return auAge;
    }

    public void setAuAge(int auAge) {
        this.auAge = auAge;
    }

    @Override
    /*
     * When we only use Comparable, this is where we write sorting
     * logic. This method is called when we implement the Comparable
     * interface in our class and call Collections.sort()
     */
    public int compareTo(Author au) {
        return this.firstName.compareTo(au.firstName);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nFirst Name :" + firstName + "\t Book name:" + bookName + "\t Age:" + auAge;
    }

}

class AgeComparator implements Comparator<Author> {

    public int compare(Author a1, Author a2) {
        if (a1.auAge == a2.auAge)
            return 0;
        else if (a1.auAge > a2.auAge)
            return 1;
        else
            return -1;
    }
}

class BookNameComparator implements Comparator<Author> {

    @Override
    public int compare(Author a1, Author a2) {
        return a1.bookName.compareTo(a2.bookName);
    }
}
  