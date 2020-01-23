package booksss;

import java.util.Scanner;

class videoL extends publisher{
    float time,size;

    videoL(){
        super.getdata();
        getdata();
    }

    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time: ");
        time=sc.nextFloat();
        System.out.println("Enter size: ");
        size=sc.nextFloat();
    }

    void disp(){
        System.out.print("Time: "+time);
        System.out.print("Size: "+size);
        System.out.println("publisher: "+publisher);
        System.out.println("title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("ISBN: "+ISBN);
    }
}