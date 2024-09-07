package arrays;

public class Arrays {

    public static void main(String[] args) {
         
        String name[] = new String[7];
        name[0] = "nikhil";
        name[1] = "aryan";
        name[2] = "ankit";
        name[3] = "sahil";
        name[4] = "tanvi";
        name[5] = "salomi";                    // this array is dynamic array.
        name[6] = "heli";                  


        for(int i = 0; i < name.length; i++){       // this statement 'name.length;' is for handle the Exception in thread "main" method for now only.
           
             System.out.println(name[i]);

        }
    }
}