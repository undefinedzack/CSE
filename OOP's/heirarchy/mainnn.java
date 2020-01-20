package heirarchy;
public class mainnn{
    public static void main(String[] args) {
        System.out.println("This is main");
        
        pm p=new pm();
        hr h=new hr();
        own o=new own();
        approver[] arr=new approver[] {p,h,o};
        employee em=new employee("Adhney","Software Enginner",1000000,arr,100);
        
    }
}