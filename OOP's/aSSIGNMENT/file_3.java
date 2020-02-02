
import java.util.Scanner;
public class file_3{
    public static void main(String args[]){
        vehicleee v=new vehicleee();
        try{
            v.getdata();
        }
        catch(invaliddd i){
            System.out.println(i);
        }
    }
}

class vehicleee{
    String numb;
    void getdata() throws invaliddd{
        Scanner sc=new Scanner(System.in);
        numb=sc.nextLine();
        
        try{//checking string length
            if(numb.length()<13 || numb.length()>13){
                throw new invaliddd("Invalid Input");
            }
            
        }
        catch(invaliddd i){
            System.out.println(i);
        }
        
        try{//checking '-'
            if(numb.charAt(2)!='-' || numb.charAt(8)!='-'){
                throw new invaliddd("Invalid -");
            }
        }
        catch(invaliddd i){
            System.out.println(i);
        }
        
        try{//checking state code
            String state="";
            state=state+numb.charAt(0)+numb.charAt(1);
            System.out.println(state);
            if( state.equals("MH")!=true && state.equals("MP")!=true && state.equals("AP")!=true && state.equals("DL")!=true && state.equals("GJ")!=true ){
                throw new invaliddd("Invalid State");
            }
        }
        catch(invaliddd i){
            System.out.println(i);
        }
        
        try{//checking city code
            
            char city1=numb.charAt(3);
            char city2=numb.charAt(4);
            if(Character.isDigit(city1)==false || Character.isDigit(city2)==false){
                throw new invaliddd("Invalid City Code");
            }
               
        }
        catch(invaliddd i){
            System.out.println(i);
        }
        
        try{//checking A-Z
            char az1=numb.charAt(6);
            char az2=numb.charAt(7);
            if( (Character.isDigit(az1)==false && Character.isUpperCase(az1)==false) || (Character.isDigit(az2)==false) && (Character.isUpperCase(az2)==false) ){
                throw new invaliddd("Invalid A-Z");
            }
            
        }
        catch(invaliddd i){
            System.out.println(i);
        }
        
        try{//checking last four digits
            char dig1=numb.charAt(9);
            char dig2=numb.charAt(10);
            char dig3=numb.charAt(11);
            char dig4=numb.charAt(12);
            if(Character.isDigit(dig1)==false || Character.isDigit(dig2)==false || Character.isDigit(dig3)==false || Character.isDigit(dig4)==false){
                throw new invaliddd("Invalid Last digit's ");
            }
        }
        catch(invaliddd i){
            System.out.println(i);
        }
      }
}

class invaliddd extends Exception{
    String outtt;
    invaliddd(String outtt){
        this.outtt=outtt;
    }
    
    @Override
    public String toString(){
        String S="This is the Exception: "+outtt;
        return S;
    }
}
