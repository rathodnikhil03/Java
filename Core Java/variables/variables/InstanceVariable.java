//Instance Variables: These are variables that are declared inside a class but outside any method or block.
//They are associated with an instance of the class and each instance has its own copy of the variable.


package variables;

public class InstanceVariable {

    int x = 14;   //Instance Variable
    
    public static void main(String[] args) {
        
        InstanceVariable var1 = new InstanceVariable();
        InstanceVariable var2 = new InstanceVariable();
        System.out.println(var1.x);
        System.out.println(var2.x);
    }
}

// :)