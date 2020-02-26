package classwork;
import java.util.*;
public class bankAccount {
    public static void main(String args[]){
        Account a = new Account();
        Account b = new Account();
        a.deposit(1000);
        a.withdraw(500);
        a.transfer(a, b, 13);
    }
}

class Account{
    String name;
    double accountNumber, balance;
    
    Account(){
        getData();
    }
    
    void getData(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name=scn.next();
        System.out.println("Enter Account Number");
        accountNumber = scn.nextDouble();
        System.out.println("Enter Balance");
        balance=scn.nextDouble();
    }
    
    double deposit(double amount){
        balance = balance + amount;
        System.out.println("Current balance after depositing is: "+balance);
        return(balance);
    }
    
    double withdraw(double amount){
        balance =balance - amount;
        System.out.println("Current balance after withdrawing is: "+balance);
        return(balance);
    }
    
    void transfer(Account a, Account b,double amount){
        if(a.balance < amount){
            System.out.println("Insufficient funds");
        }
        else{
            a.balance-=amount;
            b.balance+=amount;
            System.out.println("Balance of A: "+a.balance);
            System.out.println("Balance of B: "+b.balance);
        }
    }
    
}
