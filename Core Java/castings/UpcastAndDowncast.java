package castings;
class A{

    public void show1(){
        System.out.println("in A show");
    }
}

class B extends A{

    public void show2(){
        System.out.println("in B show");
    }
}
public class UpcastAndDowncast {
    public static void main(String[] args) {
        
        // A obj1 = (A) new B();   this is Upcasting.
        A obj1 = new B();   // <-- but you can also call like this Upcasting
        obj1.show1();

        B obj2 = (B) obj1;  // this is Downcasting
        obj2.show2();
    }
}
