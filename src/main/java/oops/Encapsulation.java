package oops;

public class Encapsulation {
    static void main() {
        Animal dog=new Animal();
        dog.setName("Lucky");
        dog.setColor("Black");
        System.out.println(dog.getColor());
        System.out.println(dog.getName());

    }
}
