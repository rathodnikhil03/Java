public class forloop {
    public static void main(String []arg){

        for(int i=1;i<=4;i++){     // (int i=4;i>=4;i--) inner loop means nested loop

            System.out.println("hi " + i);

            for(int j=4;j<=9;j++){

                System.out.println("   " + (j+1) + " - " + (j+2) );

            }
        }
     
    }
    
}
