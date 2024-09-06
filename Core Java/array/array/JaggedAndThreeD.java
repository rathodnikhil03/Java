package array;

public class JaggedAndThreeD {

    public static void main(String[] args) {
        
        int arr[][] = new int[3][];     //jagged
        
        int arr1[][][] = new int[3][4][5]; //Three Dimenisional array

        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[2] = new int[6];
        
        
        for(int i = 0; i < 3; i++){
    
            for(int j = 0 ; j < arr[i].length; j++){

                arr[i][j] = (int)(Math.random() * 10 );
                System.out.print(arr[i][j] + " ");
            
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < 3; i++){
    
            for(int j = 0 ; j < 4; j++){
                
                for(int k = 0 ; k < 5; k++){

                   arr1[i][j][k] = (int)(Math.random() * 10 );
                   System.out.print(arr1[i][j][k] + " ");
                   
                }
                System.out.println();
            }
        }
    } 
}
