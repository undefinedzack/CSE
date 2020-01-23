package booksss;

import java.util.Scanner;

public class mainnn{
    public static void main(String[] args) {
        
        int limit,choice;
        Scanner sc=new Scanner(System.in);
        limit=sc.nextInt();
        publisher[] pub=new publisher[100];
        for(int i=1;i<=limit;i++){
            System.out.println("1.Book \n2.Video\n");
            choice=sc.nextInt();
            if(choice==1){
                pub[i]=new book();
            }
            else{
                pub[i]=new videoL();
            }
            
            
        }

        //printtttttt
        for(int i=1;i<=limit;i++){
            System.out.println(pub[i]);
        }
        
        
    }
}