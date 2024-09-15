package keywords;
class method{
    
    static String collegename;   // static variable
    String name;
    int id;                       // instance variable


    public void display(){       // instance method 
        
        
        System.out.println(collegename + " : " + name + " : " + id);
    }

    public static void  display1(method s){     // display1(method s)static method
    
        System.out.println("display1");
       System.out.println(collegename + " : " + s.name + " : " +  s.id);
    }

    static
    {

        System.out.println("The static block is first call because the class loads first...");

    }

    public method()
    {
      
        name = "aryan";
        id = 19;
        System.out.println("Then the construtor is call because the object is in");

    }
 
}

public class StaticKeyword {

    
    public static void main(String[] args) //throws ClassNotFoundException 
    {


        //Class.forName("method");
         method s1 = new method();
     
        //s1.collegename = "dfw";
         s1.name = "nihkil";
        s1.id = 101;
        //s1.display();
         method s2 = new method();

        // s2.collegename = "sdf";
         s2.name = "helu";
         s2.id = 102;
        // s2.display( ); 
        // method s3 = new method();

        // s1.collegename = "sff";
        // s3.name = "tanu";
        // s3.id = 103;
        // s3.display( );

        //   System.out.println("we change the value of static variable with the help of one object reference the value while be changed it will go on all objects reference.");
        
         //s1.collegename = "lj";
        // s1.display();
        // s2.display( );
        // s3.display( );
        method.display1(s1);   //we passing the object reference in the method.display1(s1) it's run for static method.
        
    }
    
}
