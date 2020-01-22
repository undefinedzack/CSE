public class mainnn {
    public static void main(String args[]){
        stackkk s=new stackkk();
        s.pop();
        s.pop();
        s.disp();
        
    }
    
}

class stackkk{
    int top;
    int[] arr=new int[10];
    
    stackkk(){
        top=0;
    }
    
    void push(int num){
        
            
            if(top==10){
                try{
                    throw new MyException("Full Stack");
                }
                catch(MyException e){
                    System.out.println(e);
                }
            }
            arr[top]=num;
            top++;
        
        
    }
    
    void pop(){
        
        if(top==0){
            try{
                throw new MyException("Empty Stack");
            }
            catch(MyException e){
                System.out.println(e);
            }
        }
        top--;
    }
    
    void disp(){
        for(int i=0;i<top;i++){
            System.out.println(arr[i]);
        }
    }
    
}

class MyException extends Exception{
    String name;
    MyException(String name){
        this.name=name;
    }
    
    @Override
    public String toString(){
        String S="My Exception: "+name;
        return S;
    }
    
    
}
