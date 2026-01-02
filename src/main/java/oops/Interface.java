package oops;

interface Notice{
    // methods are public and abstract by default
    // variables are static public and final
    void sound();
}
class Mobile implements Notice{
    public void sound(){
        System.out.println("The noise is comming from the mobile");
    }

}

class Tablet implements Notice{
    public void sound(){
        System.out.println("The noise is comming from the tablet");
    }

}


public class  Interface{
    static void main() {
        Notice t=new Tablet();
        t.sound();

        Mobile m=new Mobile();
        m.sound();

        Tablet t2=new Tablet();
        t2.sound();
    }
}
