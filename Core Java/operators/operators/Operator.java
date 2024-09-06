package operators;

public class Operator {
    public static void main(String []arg){
    
    int num1 = 7;
    int num2 = 4;

    //int result = num1 +,*,/,-,% num2;

    num1 = num1 + 2;
    num2 += 2;
    num1++;   //post-increment: fetch the value and then increment
    ++num1;   //pre-increment:  increment and then fetch the value
    num2--;
    --num2;
    System.out.println(num1);
    
    System.out.println(num2);
    }

}

