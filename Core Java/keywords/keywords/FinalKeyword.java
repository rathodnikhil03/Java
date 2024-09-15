package keywords;

class A {

    // public final void show(){
    // System.out.println("METHOD OF A IS INHERIT"); 
    // The final method no one can override the method.
    // }
}

class B extends A {
    public void show() {
        System.out.println("it is a final class");
    }
}

final class FinalClass extends A {

    public void show() {
        System.out.println("it is a final class"); // and final class also can access another class but cannot access
                                                     // the final method.
    }

}

// class A extends FinalClass{ The type A cannot subclass the final class
// "FinalClass" -
// } because the final class is stopping the inheritance

public class FinalKeyword {

    public static void main(String[] args) {

        final double PI = 3.14; // final variable
        // PI = 85; // you can't change the final variable value because final variable
        // is constant.
        int r = 45;

        double answer = 2 * PI * r * r;
        System.out.println(answer);

        FinalClass obj = new FinalClass();
        obj.show();
    }
}