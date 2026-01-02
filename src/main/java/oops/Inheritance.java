package oops;

public class Inheritance {
    public static void main(String []args){
    Employee e1=new Employee();
    Manager d1=new Manager();
    Person p1=new Person();
    p1.name="Viraj";
    p1.salary=500000;
    d1.dept="Software";
    d1.salary=50000;
    d1.name="Ram gupat";
    e1.salary=25000;
    e1.name="Deepak Singh";
//    d1.displayDetails();
//    e1.displayDetails();
    p1.displayDetails();
    }

}
