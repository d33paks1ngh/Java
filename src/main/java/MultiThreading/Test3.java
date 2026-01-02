package MultiThreading;
// Implimenation of Thread using Runnable Interface...

public class Test3 implements Runnable{
    public void run(){
        int i=0;
        while(true){
            System.out.println(i+ "Hello");
            i++;
        }
    }

   public static void main(String []args) {
        Test3 t3=new Test3();
        Thread t=new Thread(t3);
        // because Runnable does not have its own implimentation
        t.start();

    int i=0;
    while(true){
        System.out.println(i+" World");
        i++;
    }

    }
}
