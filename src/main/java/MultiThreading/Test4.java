package MultiThreading;
// Constructors
////
//Thread()
//Thread(Runnable r)
//Thread(Runnable r, String name)
// Thread(ThreadGroup g ,String name);
//Thread(String name);
// //

    // In Thread we do not gurantee the execution of threads it is totally depends JVM and how the cpu get he threads.
public class Test4 extends Thread{
    public void run(){

        int i=0;
        while(true){
            try{Thread.sleep(1000);}catch(Exception e) {System.out.println(e);}

            System.out.println(i+"hello");
            i++;
        }

    }

    static void main(String []args) {
        Test4 t4=new Test4();
        t4.start();
        t4.setName("FirstThread");
        t4.setPriority(NORM_PRIORITY);

        int i=0;
        while(true) {
            try{Thread.sleep(1000);}catch(Exception e) {System.out.println(e);}
            System.out.println(i + " World");
            i++;
        }
    }
}
