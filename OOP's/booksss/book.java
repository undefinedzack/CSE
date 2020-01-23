package booksss;

import java.util.Scanner;

class book extends publisher{
    int pageno,edition;

    book(){
        super.getdata();
        getdata();
    }

    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Page No.: ");
        pageno=sc.nextInt();
        System.out.println("Enter edition: ");
        edition=sc.nextInt();

    }

    void disp(){
        System.out.println("Page No: "+pageno);
        System.out.println("Edition: "+edition);
        System.out.println("publisher: "+publisher);
        System.out.println("title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("ISBN: "+ISBN);
    }
}