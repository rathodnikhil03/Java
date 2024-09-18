import java.util.Scanner;

@SuppressWarnings("unused")
class test {

   
      public static void main(String[] args) {
          // Check if any arguments are passed
          if (args.length == 0) {
              System.out.println("No command line arguments provided.");
          } else {
              System.out.println("Command Line Arguments:");
              // Loop through the arguments and print them
              for (int i = 0; i < args.length; i++) {
                  System.out.println("Argument " + (i + 1) + ": " + args[i]);
              }
          }
      }
  
  
  
  

   //  static  boolean  bool = true;
   // public static void main(String[] args) {
        
   //    int ar;
   //    Scanner sc = new Scanner(System.in);
      

   //    System.out.print("enter array length: ");
   //    ar=sc.nextInt();
   //    int arr[] = new int[ar];
        
    
   //    for(int i = 0; i < arr.length; i++){

   //       System.out.print("enter the value : ");
   //       arr[i] = sc.nextInt();

         
   //    }

   //    System.out.println("my array");
   //    for(int i = 0; i < arr.length; i++){
   //       System.out.println(arr[i]+" ");         
   //    }

       
   //    // prime(arr);
   //    printArrya(arr);
   //    even(arr);
      
   //  }

   // static boolean prime(int val){
     
   //    if(val <=1){
   //       return false;
   //    }

   //    for(int k= 2; k <= Math.sqrt(val); k++ ){
   //       if(val % k == 0){
   //       return false;
   //      }
   //    }        
   //    return true;

   // }

   //    // index 0 1 2 3 4 
   //    // value 2 6 4 11 1
   //  static void printArrya(int[] arr){
   //    System.out.println("\nprime array");

   //    for(int i=0; i<arr.length; i++){
   //       if(prime(arr[i])){
   //          System.out.println(arr[i]);
   //       }
   //    }
   //  }




   //  static void even(int[] arr){
   //    System.out.println("even");
   //    for(int i = 0; i < arr.length; i++){
   //       if (arr[i] % 2 == 0) {
   //          System.out.println(arr[i]+" ");                     
   //       }
   //    }
   //  }
    
}
