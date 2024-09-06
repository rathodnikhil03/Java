package operators;

public class TernaryOperator {

    public static void main(String[] args) {
        
        int x = 35;
        int answer = 0;

         answer = x%2==0 ? 10 : 20;
           // 10 for true
           // 20 for false

            System.out.println(answer);
    }
       
}
