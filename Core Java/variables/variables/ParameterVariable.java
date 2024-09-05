//Parameter Variables: These are variables that are passed as arguments to a method. 
//They are only accessible within the method and are destroyed when the method is exited.

package variables;

public class ParameterVariable {
    
    public static void print(int x) {  // Parameter Variable
        
        System.out.println(x);

    }
    public static void main(String[] args) {
        
        print(12);

      }
}

//:)