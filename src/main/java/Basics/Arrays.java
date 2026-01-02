package Basics;

public class Arrays {
    static void main() {
        // Program for sum of array elements...
        int []arr={1,42,78,55,2};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}
