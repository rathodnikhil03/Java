package exceptions;
class NikhilExecption extends Exception{

    public NikhilExecption(String string){

        super(string);
    }

}

public class CustomExecption {

    public static void main(String[] args) {
        
        int i = 20;
        int j = 0; 
        
        try{

            j = 18/i;
            if(j==0)
               throw new NikhilExecption("I don't want to print zero");
             
        } catch(NikhilExecption e)
        {
            j = 18/1;
            System.out.println("thats the default output : " + e);

        }catch(Exception e)
        {
            System.out.println("Someting went wrong : " + e);
        }
        
        System.out.println(j);
        System.out.println("it working");
    }
    
}
