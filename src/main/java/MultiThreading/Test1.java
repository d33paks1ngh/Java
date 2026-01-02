package MultiThreading;
// Extending the Thread class in different Class and calling that in the main method.
class MyThread extends Thread{
    public void run(){
        int i=0;
        i++;
        while(true) {
//            Thread.sleep(1000);
            System.out.println(i + " Hello");
            i++;
        }
    }
}

public class Test1 {
    public static void main(String []args){
        MyThread t=new MyThread();
        t.start();
        int i=0;
        while(true){
            System.out.println(i+ " World");
            i++;
        }
    }

    
    
    
    
    
}
