package  array;
public class MultiArray {

    public static void main(String[] args) {
        
        int arr[][] = new int[3][4];      //multi-dimensional array

        for(int i=0; i<3; i++){          // using a nested loop.
            
            for(int j=0; j<4; j++){

                arr[i][j] = (int)(Math.random() * 10);
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println();

        for(int n[] : arr){        // Enhancsgd for loop
                                   // it used a single dimensional array but work like a multi-dimensional array.
            for(int m : n){

                System.out.print(m + " ");
                  
            }
            System.out.println();

        }

    }
    
}
