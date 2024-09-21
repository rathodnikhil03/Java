package interfaces;

@Deprecated
class A
{
    public void show()
    {
        System.out.println("Show a oldMethod()");
    }
}
@Author(name = "Nikhil Rathod", date = "2024-09-12") 
@interface 
Author 
{
    String name();
    String date();
}

class B extends A
{
    @Override
    public void show()
    {
        System.out.println("Show a newMethod()");
    }
}

public class Annotation {

    public static void main(String[] args) {

        @SuppressWarnings("unused")
        A obj1 = new B();
        A obj = new B();
        
        obj.show();
         
    }
    
}
