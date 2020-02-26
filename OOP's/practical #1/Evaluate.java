public class Evaluate {
    public static void main(String args[]){
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        
        t1.evaluate(10, 20, 55);
        t2.evaluate(50, 40);
        t3.evaluate(50);
    }
}

class Test{
    void evaluate(float ApT,float TechT,float PI){
        if(ApT + TechT + PI > 80){
            System.out.println("Eligible for a Programmer");
        }
        else{
            System.out.println("Not eligible for a programmer");
        }
    }
    
    void evaluate(float TechT, float PI){
        if(TechT + PI > 85){
            System.out.println("Eligible for Team Leader");
        }
        else{
            System.out.println("Not eligible for a Team Leader");
        }
    }
    
    void evaluate(float PI){
        if(PI > 90){
            System.out.println("Eligible for Project Manager");
        }
        else{
            System.out.println("Not eligible for Project Manager");
        }
    }
}
