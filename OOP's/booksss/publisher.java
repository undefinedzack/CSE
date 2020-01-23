package booksss;

class publisher{
    String publisher,title,author;
    float ISBN,price;

    void getdata(){
        Scanner Sc=new Scanner();
        System.out.println("Enter Book Title: ");
        title=Sc.nextString;
        System.out.println("Enter Author: ");
        author=Sc.nextString;
        System.out.println("Enter publisher: ");
        publisher=Sc.nextString;
        System.out.println("Enter price: ");
        price=Sc.nextString;
        System.out.println("Enter ISBN no.: ")
        ISBN=Sc.nextString;
    }

}