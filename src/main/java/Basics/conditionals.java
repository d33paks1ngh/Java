package Basics;

public class conditionals {
    public static void main(String []args){

      // if else if
        int age=5;
        if(age<18) System.out.println("Under age");
        else System.out.println("Access Granted");
        // for loops


        for(int i=0;i<20;i++){
            System.out.println(i);
        }

        // while
        int start=0;

        while(start<=20){
            System.out.println(start*10);
            start++;
        }

        // do while
        int j=1;
        do {
            System.out.println(j);
            j++;
        }while(j<=10);
    }



}
