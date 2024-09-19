package innerclass;

class Car{

    public void show(){

        System.out.println("in car show");
    }

}

class Car2 extends Car{

    public void show(){

        System.out.println("in car show");
    }

}

public class AnonymousInnerClass {
    
    public static void main(String[] args) {
        
        Car out = new  Car()

        {        // ANONYMOUS INNER CLASS
        
        
            public void show(){

                System.out.println("in Anonymous Inner Class show");
            }

        };
        out.show();
    }
}
