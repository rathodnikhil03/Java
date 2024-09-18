package methods;
class A{

     public void show(){

        System.out.println("print A class");
     }
}

class B extends A{

    public void show(){

        System.out.println("print B class");
     }

}

public class DynamicMethodDispatch{

    public static void main(String[] args) {
        
        A obj = new B();
       


        obj = new A();
        obj.show();
    }
    
}
