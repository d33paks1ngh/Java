package oops;

class A{
    public static int age=22;
    public static int weight=71;
    static void speak(){
        System.out.println("A is called");
    }
    class B{
        static void show(){
            System.out.println(weight);
        }
    }
}

public class RunTimePoly {
    public static void main(String[] args) {
        System.out.println("Hello Geek!");
       A.speak();

    }
}