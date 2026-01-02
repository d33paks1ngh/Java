package Sync;

class Mydata{
    int value;
    boolean flag=true;
  synchronized   void setValue(int x){
      try {Thread.sleep(1000);}catch(Exception e){}
        value=x;

    }
  synchronized   int getValue(){
      try {
          Thread.sleep(1000);
      }catch(Exception e){}
        return value;
    }
}

class Producer extends Thread{
    Mydata d;
    Producer(Mydata d) {
        this.d = d;
    }
   public void run() {
       int i = 0;
       while (true) {
           d.setValue(i);
           i++;
           System.out.println(i + "\t" + "Producer set the value");
       }
   }
}

class Consumer extends Thread{
    Mydata d;
    Consumer(Mydata d){
        this.d=d;
    }
   public void run () {
        int i=0;
       while (true) {
           i++;
           System.out.println(d.getValue() + "\t" + "Customer get the value");
       }
   }
}
public class InterThread {
    static void main() {
        Mydata d=new Mydata();
        Producer p1=new Producer(d);
        Consumer c1=new Consumer(d);

        p1.start();
        c1.start();
    }
}
