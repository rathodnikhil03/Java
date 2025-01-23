public class Program2 {
    
    public static void main(String[] args) {
         
        int sum = 0, number = 123565;
        
        while (number > 0) {
            sum += number % 10; // Add last digit
            number /= 10;       // Remove last digit
        }
        
        System.out.println("Sum of digits: " + sum);
        System.out.println(SumOfNo(123565));
        
    }
   
    //The second way to solve this question
    
    public static int SumOfNo(int num){

        if(num == 0){
            return 0;
        }
        return (num%10) + SumOfNo(num/10);
    }
}  