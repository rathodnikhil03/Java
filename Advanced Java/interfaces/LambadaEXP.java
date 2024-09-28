//Lambda Expressions and Exceptions in Java :-
//Lambda expressions are a concise way to represent single-method interfaces in Java. 
//However, when working with lambda expressions, it's essential to handle exceptions properly to avoid runtime errors.

//Unchecked Exceptions :-
//Lambda expressions can throw unchecked exceptions, which are subclasses of RuntimeException.
// These exceptions are not checked at compile-time, and they can be thrown by lambda expressions without declaring them in the throws clause.
package interfaces;
//@Funcationalinterface
interface Television
{
    void show();
}
interface Add{

    int addition(int i,int j);
}
public class LambadaEXP {
    
    public static void main(String[] args) {
        
        Television obj = () -> System.out.println("CID show");
        obj.show();

        Add obj2 = (i,j) -> i + j;        
          
        
        int answer = obj2.addition(5,5);
        System.out.println(answer);
         
    }
}
