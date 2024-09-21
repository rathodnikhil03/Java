//class - class -> extends
//class - interface -> implements
//interface - interface -> extends

package interfaces;

interface A{
      
    int weight = 2500;          // The variables in interface is by defalut final and static.
    String type = "oxygen";

    void air();
    void airType(); 
}

interface C{

    void dangerAir();

}

interface D extends C{
   
    
}

class B implements A,D{

 

     public void air(){

        System.out.println("Air is important for everything");

     }

     public void airType(){

        System.out.println("Oxygen for human and animales life and carbon dioxide for plant and trees.");

     }

  
    public void dangerAir() {
         
        System.out.println("Hydrogen is Dangerous for human and animales");
    }
}

public class Designs {
    
    public static void main(String[] args) {
        
          A obj1 = new B();
          obj1.air();
          obj1.airType();
          D obj2 = new B();
          obj2.dangerAir();
        
          System.out.println(A.type + " : " + A.weight);
    }
}

//complie this in terminal "java -cp . interfaces.Designs" :)