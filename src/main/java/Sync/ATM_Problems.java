package Sync;

import javax.swing.*;

// Atm is the common resource...
class Atm{
   synchronized void checkBalance (String name){
        System.out.println("Name :\t" + name + "\t" + "Balance Checked\t" + Thread.currentThread().getName());
    }
   synchronized void Withdraw (String name,int amount){
        System.out.println("Name :\t" + name + "\t" + "Amount :\t" + amount + "\t" + Thread.currentThread().getName());

    }

}

// Customer is first Thread...

class Customer extends Thread{
     Atm atm;
     String name;
     int amount;

     // creating obj of ATM class by reference .
     Customer(Atm data){
         this.atm=data;
     }

     void SetDetails(String name,int amount){
         this.name=name;
         this.amount=amount;
     }

     public void run(){
        atm.checkBalance(name);
        atm.Withdraw(name,amount);
         System.out.println("Thread is also running at the same time ");
     }


}

// ATM_problem is main class ,

public class ATM_Problems {
    static void main() {
        Atm a=new Atm();
        Customer c1=new Customer(a);
        Customer c2=new Customer(a);
        c1.SetDetails("Deepak",25000);
        c2.SetDetails("Asif",25800);

        c1.start();

        c2.start();
        System.out.println("Our Main is also running....");
    }
}
