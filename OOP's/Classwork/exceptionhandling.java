package Classwork;
public class exceptionhandling{
    public static void main(String args[]) {
        try{
        int a=0;
        throw new NullPointException();
        int b=42/a;
        }
        catch (NullPointException e) {
            //TODO: handle exception
            System.out.println("This is error"+e);
            
        }
    }
}

