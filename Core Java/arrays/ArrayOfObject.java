package arrays;

class store{
     
    String name_of_product;
    int qty;
    int price;

}


public class ArrayOfObject {
       
    public static void main(String[] args) {
        
      store s1 = new store();
      s1.name_of_product = "iphone";
      s1.qty = 4 ;
      s1.price = 150000;

      store s2 = new store();
      s2.name_of_product = "poco x6 pro";
      s2.qty = 1;
      s2.price = 25000;

      store s3 = new store();
      s3.name_of_product = "lenovo";
      s3.qty = 3;
      s3.price = 15000;

      store st[] = new store[3];     // array of object for store a string and integer data. 
    
      st[0] = s1;
      st[1] = s2;
      st[2] = s3;

      for(int i =0; i < st.length; i++){

        System.out.println(st[i].name_of_product + " : " + st[i].qty + " : " + st[i].price);

      }


    }
    
}
