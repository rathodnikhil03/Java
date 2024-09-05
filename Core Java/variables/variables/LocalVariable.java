//Local Variables: These are variables that are declared inside a method or a block of code. 
//They are only accessible within that method or block and are destroyed when the method or block is exited.


package variables;

public class LocalVariable {
    
  public static void main(String[] args) {

    int y = 10; // Local variable
    System.out.println(y);

  }
}
    

//-----------------------------------------------------------------------------------------------------------------

//Run your Java program with the correct classpath: When you run your Java program,
//make sure that you're specifying the correct classpath. For example, 
//if your compiled class file is located in a directory called variables, then you can run your program like this:
//java -cp . variables.LocalVariable "If it doesn't work, then use the commands given below".
//javac -d . variables/InstanceVariable.java
//java variables.InstanceVariable
//:)