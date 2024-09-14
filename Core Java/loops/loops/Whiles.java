package loops;
public class Whiles
{
    public static void main(String []a)
    {
        int x = 1;
         

        while(x<=4)      
        {
            System.out.println("hi "+ x);
            int y = 1;
            while(y<=3)                               // Nested while loop because the value start for 1 just like watch.
            {
                System.out.println("hey" + y);
                y++;
            }
            x++;
        }
    } 
}