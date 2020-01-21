
package Classwork;
import java.util.Scanner;

public class fast{
    public static void main(String args[]){
        mynumber mn=new mynumber();
        try {
            mn.positive();
        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println("This is it");
        }
    }
}

class mynumber{
    Scanner Sc=new Scanner(System.in);
    int[] arr;
    void positive() throws ArithmeticException{
        for(int i=1;i<=10;i++){
            arr[i]=Sc.nextInt();
            if(arr[i]<0){
                throw new ArithmeticException();
            }

            
        }

    }
}