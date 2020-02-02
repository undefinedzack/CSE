import java.util.Scanner;
public class file_5 {
    public static void main(String args[]){
        interval i=new interval();
        i.getdata();
        i.callall();
        i.disp();
    }
}

class student{
    String name;
    int rollNo;
    void getdata(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Student Name:");
        name=scn.next();
        System.out.println("Enter Roll No.");
        rollNo=scn.nextInt();
    }   
}

interface testtt{
    void getTest1Marks();
    void getTest2Marks();
}

interface assignment{
    void getAssignment1Marks();
    void getAssignment2Marks();
}

class interval extends student implements testtt,assignment{
    int asgn1,asgn2,t1,t2,total;
    Scanner scn=new Scanner(System.in);
    @Override
    public void getTest1Marks(){
        System.out.println("Enter Test 1 Marks");
        t1=scn.nextInt();
    }
    
    @Override
    public void getTest2Marks(){
        System.out.println("Enter Test 2 marks");
        t2=scn.nextInt();
    }
    
    @Override
    public void getAssignment1Marks(){
        System.out.println("Enter Assignment 1 Marks");
        asgn1=scn.nextInt();
    }
    
    @Override
    public void getAssignment2Marks(){
        System.out.println("Enter Assignment 2 Marks");
        asgn2=scn.nextInt();
    }
    
    void internal(){
        total=t1+t2+asgn1+asgn2;
    }
    
    void callall(){
        getTest1Marks();
        getTest2Marks();
        getAssignment1Marks();
        getAssignment2Marks();
        internal();
    }
    
    void disp(){
        System.out.println("The Name: "+name);
        System.out.println("The Roll No.: "+rollNo);
        System.out.println("The Marks............");
        System.out.println("Test 1 "+t1);
        System.out.println("Test 2 "+t2);
        System.out.println("Assignment 1 "+asgn1);
        System.out.println("Assignment 2 "+asgn2);
        System.out.println("Total Internal Marks "+total);
    }
}
