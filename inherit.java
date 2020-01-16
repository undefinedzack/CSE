
import java.util.Scanner;

public class inherit {
    public static void main(String[] args){
        System.out.println("This is Main");
        
        
        time t1=new time();
        time t2=new time();
        time tf=new time();
        System.out.println("Enter time#1");
        t1.getdata();
        System.out.println("Enter time#2");
        t2.getdata();
        tf=tf.add(t1, t2, tf);
        tf.display(tf);
        
        dist d1=new dist();
        dist d2=new dist();
        dist d=new dist();
        System.out.println("Enter Distance#1");
        d1.getdata();
        System.out.println("Enter Distance#2");
        d2.getdata();
        d=d.add(d1, d2, d);
        d.display(d);       
    }
}

class addy{
    
    int add(int i,int j){
        return(i+j);
    }
    
}

class time extends addy{
    int hf,mf,sf;
    
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Hour");
        hf=sc.nextInt();
        
        System.out.println("Enter Minutes");
        mf=sc.nextInt();
        
        System.out.println("Enter Seconds");
        sf=sc.nextInt();
    }
    
    time add(time t1,time t2,time t3){
        t3.sf=add(t1.sf,t2.sf);
        t3.mf=add(t1.mf,t2.mf);
        t3.hf=add(t1.hf,t2.hf);
        if(t3.sf>=60){
            t3.mf=t3.mf+1;
            t3.sf=t3.sf-60;
        }
        if(t3.mf>=60){
            t3.hf=t3.hf+1;
            t3.mf=t3.mf-60;
        }   
        return(t3);
    }
    
    void display(time t){
        System.out.println("Hours:"+t.hf);
        System.out.println("Minutes:"+t.mf);
        System.out.println("Seconds:"+t.sf);
    }
}

class dist extends addy{
    int f3,i3;
    
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Feet");
        f3=sc.nextInt();
        System.out.println("Enter Inches");
        i3=sc.nextInt();
    }
    
    
    dist add(dist d1,dist d2,dist d3){
        
        d3.f3=add(d1.f3,d2.f3);
        d3.i3=add(d1.i3,d1.i3);
        if(d3.i3>=12){
            d3.f3++;
            d3.i3-=12;
        }
        return(d3);
    }
    
    void display(dist d){
        System.out.println("Foot's:"+d.f3);
        System.out.println("Inches:"+d.i3);
    }
}