package heirarchy;
import java.util.Scanner;

class employee{
    String name;
    String designation;
    float salary;
    int bal;
    approver[] arr;

    //The Constructor's
    employee(String name,String designation,float salary,approver[] arr,int bal){
        this.name=name;
        this.designation=designation;
        this.salary=salary;
        this.bal=bal;
        this.arr=arr;

    }
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name of Employee:");
        name=sc.next();
        System.out.println("Enter Designation:");
        designation=sc.next();
        System.out.println("Enter Salary:");
        salary=sc.nextFloat();
    }

    void display(employee e){
        System.out.println("Name: "+e.name);
        System.out.println("Designation: "+e.designation);
        System.out.println("Salary: "+e.salary);
    }

    public void request(int days){
        boolean r;
        System.out.println(designation+" "+name+" requested "+days+" of leave");
        if(days<=bal){
            for(int i=0;i<=arr.length;i++){
               approver a=new approver();
               r=a.
               if(r==true){
                   System.out.println("Thank You");
                   break;
               }
            }
        }
        else{
            System.out.println("Sorry! You can't apply for the holidays.\n")
        }
    }
}



