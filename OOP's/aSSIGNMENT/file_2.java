


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class file_2 {
    
    public static void main(String args[]) throws IOException {
        File f2=new File("employee.txt");
        f2.createNewFile();
        Scanner scn=new Scanner(f2);
        
        int jan=0,feb=0,mar=0,apr=0,may=0,jun=0,jul=0,aug=0,sep=0,oct=0,nov=0,dec=0;
        while(scn.hasNextLine()){
            
            String month=scn.nextLine();
            if(month.equals("jan")){
                jan++;
            }
            if(month.equals("feb")){
                feb++;
            }
            if(month.equals("mar")){
                mar++;
            }
            if(month.equals("apr")){
                apr++;
            }
            if(month.equals("may")){
                may++;
            }
            if(month.equals("jun")){
                jun++;
            }
            if(month.equals("jul")){
                jul++;
            }
            if(month.equals("aug")){
                aug++;
            }
            if(month.equals("sep")){
                sep++;
            }
            if(month.equals("oct")){
                oct++;
            }
            if(month.equals("nov")){
                nov++;
            }
            if(month.equals("dec")){
                dec++;
            }
        }
        System.out.println("employee in jan: "+jan);
        System.out.println("employee in feb: "+feb);
        System.out.println("employee in mar: "+mar);
        System.out.println("employee in apr: "+apr);
        System.out.println("employee in may: "+may);
        System.out.println("employee in jun: "+jun);
        System.out.println("employee in jul: "+jul);
        System.out.println("employee in aug: "+aug);
        System.out.println("employee in sep: "+sep);
        System.out.println("employee in oct: "+oct);
        System.out.println("employee in nov: "+nov);
        System.out.println("employee in dec: "+dec);
        
    }
}
