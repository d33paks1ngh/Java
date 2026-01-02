package Exception;

public class Test4 {
    static void main() {
        int a=15;
        int b=0;
        try{
            int result=a/b;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Divided by zero occurs  "+e);
//            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally block will always excute");
        }

        System.out.println("Program continues here");


    }
}
