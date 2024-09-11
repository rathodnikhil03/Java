package object;
class Addition
{
    int i;

     public int add(int n1,int n2)
     {
        int  r = n1 + n2 ;
         return r;

     }

}

public class Objects{
    public static void main(String ar[])
    {
    
        int num1 = 2;
        int num2 = 3;

        Addition a =new Addition();
        int result = a.add(num1,num2);
        System.out.println(result);
    }
}
