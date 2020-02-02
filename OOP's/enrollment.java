import java.util.Scanner;
public class enrollment {
    public static void main(String args[]){
        enrollNO en=new enrollNO();
        try{    
            en.getdata();
        }
        catch(enExcep e){
            System.out.println(e);
        }
        en.display();
        
        
    }
    
    
}

class enrollNO{
    String name,enroll,pass,cgpa;
    void getdata() throws enExcep{
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Name: ");
        name=scn.nextLine();
        System.out.println("Enter CGPA :");
        cgpa=scn.nextLine();
        System.out.println("Enter enrollment number: ");
        enroll=scn.nextLine();
        System.out.println("Enter password: ");
        pass=scn.nextLine();
        
        //checking valid Enrollment number
        
        //Checking BE
        String be="";
        be=be+enroll.charAt(0)+enroll.charAt(1);
        try{
            if(!be.equals("BE")){
                throw new enExcep("Incorrect BE");
            }
        }
        catch(enExcep e){
            System.out.println(e);
        }
        
        //Checking year
        char y1=enroll.charAt(2);
        char y2=enroll.charAt(3);
        String year="";
        year=year+enroll.charAt(2)+enroll.charAt(3);
        int yearrr=Integer.parseInt(year);
        try{
            if(Character.isDigit(y1)==false || Character.isDigit(y2)==false || yearrr<11 || yearrr>20 ){
                throw new enExcep("Invalid year");
            }
        }
        catch(enExcep e){
            System.out.println(e);
        }
        
        //checking CSU
        
        String s="";
        s=s+enroll.charAt(4)+enroll.charAt(5)+enroll.charAt(6);
        try{
            if(!s.equals("CSU") && !s.equals("ENU") && !s.equals("ECU") && !s.equals("EEU") ){
               throw new enExcep("Invalid CSU"); 
            }
        }
        catch(enExcep e){
            System.out.println(e);
        }
        
        //checking last 3 digits
        char d1=enroll.charAt(7);
        char d2=enroll.charAt(8);
        char d3=enroll.charAt(9);
        String dig="";
        dig=dig+enroll.charAt(7)+enroll.charAt(8)+enroll.charAt(9);
        int diggg=Integer.parseInt(dig);
        try{
            if(Character.isDigit(d1)==false || Character.isDigit(d2)==false || Character.isDigit(d3)==false || diggg<1 || diggg>250 ){
                throw new enExcep("Invalid Last 3 digits");
            }
        }
        catch(enExcep e){
            System.out.println(e);
        }
        
        
        //Checking the PASSWORD
        
        //checking password length
        try{
            if(pass.length()<8){
                throw new enExcep("too small password, try something bigger");
            }
        }
        catch(enExcep e){
            System.out.println(e);
        }
        
        //Checking Upper Case
        try{
            int cnt=0;
            for(int i=0;i<pass.length();i++){
                if( Character.isUpperCase(pass.charAt(i)) ){
                    cnt++;
                }
            }
            if(cnt==0){
                throw new enExcep("no Uppercase in password");
            }
        }
        catch(enExcep e){
            System.out.println(e);
        }
        
        //Checking Lower Case
        try{
            int cnt=0;
            for(int i=0;i<pass.length();i++){
                if( Character.isLowerCase(pass.charAt(i)) ){
                    cnt++;
                }
            }
            if(cnt==0){
                throw new enExcep("no LowerCase in password");
            }
        }
        catch(enExcep e){
            System.out.println(e);
        }
        
        //Checking one digit
        try{
            int cnt=0;
            for(int i=0;i<pass.length();i++){
                if( Character.isDigit(pass.charAt(i)) ){
                    cnt++;
                }
            }
            if(cnt==0){
                throw new enExcep("no Uppercase in password");
            }
        }
        catch(enExcep e){
            System.out.println(e);
        }
        
        //Checking special characters
        try{
            int cnt=0;
            String spl="*#!%$";
            for(int i=0;i<pass.length();i++){
                if(spl.contains(Character.toString(pass.charAt(i)))){
                    cnt++;
                }
            }
            if(cnt==0){
                throw new enExcep("no Special Character in password");
            }
        }
        catch(enExcep e){
            System.out.println(e);
        }
        
    }
    
    void display(){
        System.out.println("Enrollment No. : "+enroll);
        System.out.println("Password: "+pass);
    }
}


//user defined Exception
class enExcep extends Exception{
    String name;
    enExcep(String name){
        this.name=name;
    }
    
    @Override
    public String toString(){
        String S="This is Exception: "+name;
        return S;
    }
}
