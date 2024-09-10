package methods;
class Store{

      public void getaudio(){

         System.out.println("playing audio...");
      
      }

      public String buybook(int cost){

        if (cost >=10) 
          return "ada book";
        else
          return "can buy ada book"; 
      }

}

public class CreateMethod {
    public static void main(String[] args) {
      
      Store c  = new Store();
      c.getaudio();
      String s = c.buybook(1);
      System.out.println(s);
      

    }
    
}
