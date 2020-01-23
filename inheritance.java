
package inheritance;
import java.util.Scanner;
public class Inheritance {

    public static void main(String[] args) {
        int ch,n;
        publisher p[]=new publisher[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the choice 1.book 2.video lecture");
        ch=sc.nextInt();
        System.out.println("Enter the number of entries");
        n=sc.nextInt();
        if(ch==1)
        {
           for(int i=0;i<n;i++)
           {
               p[i]=new book();
               p[i].getdata();
               
           }
        }
        else
        {
           for(int i=0;i<n;i++)
           {
               p[i]=new videolecture();
               p[i].getdata();
           }
        }
        System.out.println("*******OUTPUT*******");
         for(int i=0;i<n;i++)
           {
               p[i].display();
               
           }          

        
        





//book b=new book();
        //videolecture v=new videolecture();
        //b.getdata();
        //b.display();
        //v.getdata();
        //v.display();
    }
    
}
class  publisher
{
  String title,ISBN,author;
  double price;
  void getdata()
  {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter title:");
      title=sc.next();
      System.out.print("Enter ISBN:");
      ISBN=sc.next();
      System.out.print("Enter author:");
      author=sc.next();
      System.out.print("Enter price:");
      price=sc.nextDouble();
  }
  void display()
  {
      System.out.println("Title is:"+title);
      System.out.println("ISBN is:"+ISBN);
      System.out.println("Author is:"+author);
      System.out.println("Price is:"+price);
      
  }
}
class book extends publisher
{
   int pgno,edition;
   
   void getdata()
   {
       super.getdata();
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter page number:");
       pgno=sc.nextInt();
       System.out.print("Enter edition:");
       edition=sc.nextInt();
    }
   void display()
   {
       super.display();
       System.out.println("Page number in a book is:"+pgno);
       System.out.println("Edition of book is:"+edition);
   }
}
class videolecture extends publisher
{
    int size;
    float time;
    void getdata()
    {
       super.getdata();
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter time:");
       time=sc.nextFloat();
       System.out.print("Enter size:");
       size=sc.nextInt();
    }
    void display()
    {
    super.display();
     System.out.println("Time of a video lecture is "+time);
     System.out.println("Size of a video lecture is "+size);
    }
    
}
