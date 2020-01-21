package Classwork;
public class exceptionhandling{
    public void main(String args[]) {
        try{
        int a=0;
        throw new ArithmeticException();
        //int b=42/a;
        }
        catch (ArithmeticException e) {
            
            System.out.println("This is error"+e);
            
        }
    }
}

