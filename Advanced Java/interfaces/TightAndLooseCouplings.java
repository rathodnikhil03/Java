package interfaces;

//when we use a abstract class we extends another class.
//when we use a interface we implements another class
// abstract class  Computer{

//     public abstract void code();
// }

//Loosely couple
interface Computer {

    void code();
}

class Desktop implements Computer {

    public void code() {
        System.out.println("code,complie,run : Faster");
    }
}

class Laptop implements Computer {

    public void code() {
        System.out.println("code,complie,run");
    }
}

class Developer {

    public void devApp(Computer lap) {
        lap.code();
    }
}

public class TightAndLooseCouplings {

    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer nikhil = new Developer();
        nikhil.devApp(desk);
        nikhil.devApp(lap);
    }
}

// Tightly couple
// package interfaces;

// class Desktop{

// public void code(){
// System.out.println("code,complie,run : Faster");
// }
// }
// class Laptop{

// public void code(){
// System.out.println("code,complie,run");
// }
// }

// class Developer {

// public void devApp(Laptop lap){
// lap.code();
// }
// }

// public class TightAndLooseCouplings {

// public static void main(String[] args) {

// Laptop lap = new Laptop();
// Desktop desk = new Desktop();

// Developer nikhil = new Developer();
// nikhil.devApp(desk);
// }
// }

//:)