import java.io.File;
public class treee {
    public static void main(String args[]){
        File f=new File("F:\\A");
        direct d= new direct();
        d.depth(f,0);
    }
}

class direct{
    public void depth(File f1,int d){
        
        if(f1!=null){
            if(f1.isDirectory()){
                f1.getName();
                File[] f2=f1.listFiles();
                if(f2!=null){
                    
                    for(int i=0;i<f2.length;i++){
                        for(int j=0;j<d;j++){
                            System.out.print("    ");
                        }
                        System.out.println(f2[i].getName()+"\n");
                        
                        depth(f2[i],d+1);
                        
                    }
                }
            }
        }
    }
}


