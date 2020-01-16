import java.util.Scanner;

public class sanction{
    public static void main(String[] args) {
        System.out.println("This is main");
        employee em=new employee();
        em.getdata();
    }
}

class employee{
    String name;
    String designation;
    float salary;

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
}

public interface approver{

}