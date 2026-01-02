package Exception;

import java.lang.reflect.Array;


public class Test5 {

    static public void checkAge(int age){
        if(age<18){
            System.out.println("throwing exception...");
            throw new ArithmeticException("Not eligible to vote"); // code after throw does not executes...
        }
        else {
            System.out.println("Eligible to vote");
        }
    }
    public static void main() {
        try {
            checkAge(15);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Program continue....");



    }

}
