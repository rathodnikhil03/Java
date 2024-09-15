package keywords;
abstract class Car{

    public abstract void drive();

}
class Alto extends Car{

    public void drive(){
        System.out.println("shell i drive this car");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        
        Car obj = new Alto();
        obj.drive();
        
    }
    
}
