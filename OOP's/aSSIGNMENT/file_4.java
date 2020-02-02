import java.util.Scanner;
public class file_4 {
    public static void main(String args[]){
        counter c=new counter();
        c.getdata();
        double re=c.calc();
        System.out.println(re);
    }
}

class counter{
    String name;
    double units,cost=0;
    
    void getdata(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        name=scn.next();
        System.out.println("Enter No. of units consumed");
        units=scn.nextFloat();
    }
    
    double calc(){
        //condition 1
        if(units<=100){
            cost=500;
        }
        
        //condition 2
        else if(units>100 && units<=600){
            units=units-100;
            cost=cost+(2.36*units);
            cost=cost+500;//first 100
            
        }
        
        //condition 3
        else if(units>600 && units<=2600){
            units=units-600;
            cost=cost+(3.5*units);
            cost=cost+(2.36*500);
            cost=cost+500;
        }
        
        //condition 4
        else if(units>2600){
            units=units-2600;
            cost=cost+(5.09*units);
            cost=cost+(3.5*2000);
            cost=cost+(2.36*500);
            cost=cost+500;
        }
        return(cost);
    }
}