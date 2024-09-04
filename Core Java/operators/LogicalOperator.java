public class LogicalOperator {
    public static void main(String[] args) {
        
        int a = 7;
        int b = 8;
        int c = 9;
        int d = 4;


        boolean answer = a>b && c<d;
        //a>b && c<d; ::::  And operater for one condition is false the answer is false.
        //a>b || c<d; ::::  OR operater for one condition is true the answer is true.
        //!  :::: when answer is true using not operater this gives you false.
        System.out.println(answer);
    }
}
