package methods;
class addition{
 
    public int add(int n1,int n2){
                                      
         return n1+n2;

    }                                         
                                
    public int add(int n1,int n2,int n3){   
                                                       
        return n1+n2+n3;                 //it's not just about number of parameters.                
    }                                    //it's also about the type of parameters. 

    public double add(double n1,int n2){

        return n1-n2;  

    }

}

public class MethodOverload {
     public static void main(String[] args) {

        addition ad = new addition();
        int str1 = ad.add(3,5);
        int str2 = ad.add(3,5,5);
        double str3 = ad.add(3,5);
        System.out.println(str1 + " " + str2 + " " + str3);
          

    
  }

    
}
