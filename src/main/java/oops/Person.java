package oops;

public class Person extends Employee {
    public boolean task;
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("The assigned task is "+task);
    }
}
