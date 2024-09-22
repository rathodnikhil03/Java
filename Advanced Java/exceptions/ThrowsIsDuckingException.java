package exceptions;
class A{

    public void show() throws ClassNotFoundException{

        Class.forName("B");
    }
}

public class ThrowsIsDuckingException {
    
    public static void main(String[] args) {
        
        A obj = new A();
        try{

        obj.show();

        }catch(ClassNotFoundException e){

            System.out.println("The B class is not exist : " + e);
            e.printStackTrace();
        }
    }
}
