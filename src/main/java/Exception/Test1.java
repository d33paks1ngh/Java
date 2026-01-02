package Exception;

public class Test1 {
    public static void main(String []args){
        int a=10;
        int b=0;
        try{
            // risky code
            int result=a/b;
            System.out.println(result);
        }catch(Exception e){
            System.out.println("Division by zero"+e);
        }
        System.out.println("Program continues...");

    }
}
