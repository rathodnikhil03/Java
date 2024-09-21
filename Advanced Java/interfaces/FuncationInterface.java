package interfaces;

//@FuncationalInterface
interface NotHuman
{
    void animals();
}

// class Show implements NotHuman
// {
//      public void animal(){

//         System.out.println("yes it is animal");
//      }
// }
public class FuncationInterface {
    
    public static void main(String[] args) {
        
    
         NotHuman obj = new NotHuman(){
 
            public void animals(){

                System.out.println("yes it is animal");
             }

         }; 
        obj.animals();
     }    
}
