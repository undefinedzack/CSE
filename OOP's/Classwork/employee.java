
import java.util.Scanner;



public class employee{
    String name,empID;
    double mob;
    
    void getdata(){
        final Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        name=sc.next();
        System.out.println("Enter Employee Id: ");
        empID=sc.next();
        System.out.println("Enter mobile no: ");
        mob=sc.nextDouble(); 
    }

    // the check
    try{
        if (name == null) {
            throw new MyExceptionn("Invalid Name");

        }
    }catch(MyExceptionn e){
        System.out.println("Ex");
    }

    try {
        if()
    } catch (Exception e) {
        //TODO: handle exception
    }

}

class MyExceptionn extends Exception{
    String name;
    MyExceptionn(final String name){
        this.name=name;
    }
    
    @Override
    public String toString(){
        final String S="My Exception: "+name;
        return S;
    }
    
    
}

