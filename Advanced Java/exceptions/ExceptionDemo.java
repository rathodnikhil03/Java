package exceptions;
public class ExceptionDemo{
    public static void main(String[] args) {
        
        int i = 0;
        int j = 0; 
        
        try{

            j = 18/i;
            

        } catch(Exception e)
        {
            System.out.println("Something went worng " + e);
        }

        System.out.println(j);
        System.out.println("it working");
    }
}
