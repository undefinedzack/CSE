package booksss;

import java.util.Scanner;

public class publisher {
    String publisher,title,author;
    float ISBN,price;

    void getdata(){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Book Title: ");
        title=Sc.next();
        System.out.println("Enter Author: ");
        author=Sc.next();
        System.out.println("Enter publisher: ");
        publisher=Sc.next();
        System.out.println("Enter price: ");
        price=Sc.nextFloat();
        System.out.println("Enter ISBN no.: ");
        ISBN=Sc.nextFloat();
    }

    void disp(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(publisher);
        System.out.println(ISBN);
        System.out.println(price);
    }

    //constructorrrrr
    publisher(){
        System.out.println("this is it");
        //getdata();
    }

}