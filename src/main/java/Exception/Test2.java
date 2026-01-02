package Exception;

public class Test2 {
    static void main() {
        int []arr={1,2,3};
        try{
        System.out.println(arr[5]);

        }catch (Exception e){
            System.out.println("ArrayIndex out of bound check");
        }

        System.out.println("Program continues....");
    }
}
