package Exception;

public class Test3 {
    static void main() {
        int []arr={1,2,3,0,5,6,7,8};
        try{
            for(int i=1;i<15;i++){
                System.out.println(arr[i]/i-1);
            }
        }catch (ArithmeticException e){
            System.out.println("Divided by zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound check");
        }catch (Exception e){
            System.out.println("Some other Exceptions ");
        }
        System.out.println("Program Continuesss......");
    }

}
