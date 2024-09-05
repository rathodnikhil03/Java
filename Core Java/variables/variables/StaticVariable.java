//Static Variables: These are variables that are declared with the static keyword. 
//They are shared by all instances of the class and are stored in memory only once.

package variables;
import java.lang.SuppressWarnings;

public class StaticVariable {
    
    static int x = 11; // Static Variable

    
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        
        StaticVariable var = new StaticVariable();
        System.out.println(var.x);
        System.out.println(StaticVariable.x);
    }
}

// @SuppressWarnings("static-access") "If you print with an object reference, it gives a warning, which is suppressed."
//"You can print with the class name , because it's a static variable, and the warning is suppressed."

//:)