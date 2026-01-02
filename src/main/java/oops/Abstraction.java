package oops;
abstract   class Vehicle{

    // abstract method
     abstract void start();

     // concreate method
     void fuel(){
        System.out.println("Fuel is Required");
     }
}

class car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car starts with a key");
    }

}
class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike starts with button");

    }
}

public class Abstraction {
    static void main() {
    Vehicle v1=new car();
    Vehicle v2=new Bike();
    v1.start();
    v2.start();
    v1.fuel();

    }
}
