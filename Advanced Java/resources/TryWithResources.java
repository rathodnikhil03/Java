package resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    
    public static void main(String[] args) throws IOException {
        
        //BufferedReader br =null;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){    // a new concept try with resources,
            // where you don't even have to mention the finally block, with the help of try block, the advantage is once 
            //the try gets over this resource will be closed automatically.

            System.out.print("Enter the name :");

            //InputStreamReader in = new InputStreamReader(System.in);
            //br = new BufferedReader(new InputStreamReader(System.in));

            br.read();
         
        }
        // finally{           // whenever you want to close a resources just use a finally block.
        //      br.close();
        // }
        
    }
}
