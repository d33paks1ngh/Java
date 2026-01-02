package oops;

public class Polymorphism {
    static void main() {
        //compile time polymorphism
        System.out.println(Calculator.sum(10.2,10.3));
        System.out.println(Calculator.sum(10,12,15));
        System.out.println(Calculator.sum(15,20));
    }
}
