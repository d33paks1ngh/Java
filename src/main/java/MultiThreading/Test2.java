package MultiThreading;
// Extending the Thread in the Main class itself;
class Test2 extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }

    public static void main(String []args) {
        Test2 t2=new Test2();
        t2.start();
//        Thread t=new Thread();

        int i=0;
        while(true){
            System.out.println(i+" world");
            i++;
        }

    }
}
