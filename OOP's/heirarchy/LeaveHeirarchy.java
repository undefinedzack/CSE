public class LeaveHeirarchy {
    public static void main(String args[]){
        
        projectManager p = new projectManager();
        HRmanager hr = new HRmanager();
        Owner o = new Owner();
        
        approver[] arr = new approver[]{p, hr, o};
        Employee e = new Employee("Adhney","Software Engineer",100,arr);
        e.request(99);
    }
}

//Employee
class Employee{
    String name, designation;
    int balance_leaves;
    approver[] arr = new approver[]{};
    
    Employee(String name, String designation, int balance_leaves, approver[] arr){
        this.name = name;
        this.designation = designation;
        this.balance_leaves = balance_leaves;
        this.arr=arr;
    }
    
    void request(int days){
        if(days<balance_leaves){
            approver a;
            boolean yasss = false;
            for(int i=0;i<arr.length;i++){
                a = arr[i];
                if(a.approve(days)){
                    System.out.println("Request for "+days+" days has been granted");
                    yasss = true;
                    break;
                }
            }
            if(yasss == false){
                System.out.println("Request cannot be granted.");
            }
            balance_leaves-=days;   
        }
        else{
            System.out.println("Request cannot be granted.");
        }
    }
    
    
    
    
}    

//The Approver
interface approver{
    boolean approve(int days);
}
    
//The Project Manager
class projectManager implements approver{
    @Override
    public boolean approve(int days){
        if(days<=7){
            System.out.println("Project Manager:");
            return true;
        }
        else{
            return false;
        }
    }
}

//The HR Manager
class HRmanager implements approver{
    @Override
    public boolean approve(int days){
        if(days<=30){
            System.out.println("HR Manager");
            return true;
        }
        else{
            return false;
        }
    }
}

//The Owner
class Owner implements approver{
    @Override
    public boolean approve(int days){
        if(days<=90){
            System.out.println("Owner");
            return true;
        }
        else{
            return false;
        }
    }
}
