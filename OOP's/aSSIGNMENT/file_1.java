
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class f1 {
    public static void main(String[] args) throws IOException {
        int num;
        File f1=new File("numbers.txt");
        Scanner scn=new Scanner(f1);
        //creating the fileeeeeeeeeeee
//         if(f1.createNewFile()==true){
//             System.out.println("File Created\n");
//         }
//         else{
//             System.out.println("File already exists\n");
//         }

        //writing the fileeeeeeeeeee
//        Scanner sc=new Scanner(System.in);
//        for(int i=1;i<=10;i++){
//            System.out.println("Enter number: ");
//            num=sc.nextInt();
//            f1.write(num);
//            f1.close();
//        }
        
            int[] even=new int[10];
            int[] odd=new int[10];
            int i=0,j=0;
            while(scn.hasNextLine()){
                int data=Integer.parseInt(scn.nextLine());
                if(data%2==0){
                    //System.out.println("Even");
                    even[i]=data;
                    i++;
                }
                else{
                    //System.out.println("Odd");
                    odd[j]=data;
                    j++;
                }
            }
            int e=i,o=j;
            i=j=0;
            System.out.println("Even Numbers:");
            while(i<e){
                
                System.out.println(even[i]);
                i++;
        
            }
            System.out.println("Odd Numbers:");
            while(j<o){
                
                System.out.println(odd[j]);
                j++;
            }

    }
}