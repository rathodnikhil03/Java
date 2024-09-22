package exceptions;
public class MutipleException {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        
        int i = 2;
        int j = 0; 
        
        String str = null ; 

        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        try{

            j = 18/i;
            System.out.println(str.length());
            System.out.println(arr[0]);
            System.out.println(arr[5]);


        } catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero : " + e);

        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay on your limit : " + e);

        }catch(Exception e)
        {
            System.out.println("Someting went wrong : " + e);
        }
        
        System.out.println(j);
        System.out.println("it working");
    }
}
