package interfaces;
//@NormalInterface
interface Television
{
    void channel();
    void show();

}

class Electronic implements Television{

    public void channel(){

        System.out.println("SonytV channel");
    }

    public void show(){

       System.out.println("CID show");
    }

}

public class NormalInterfaces{
    
    public static void main(String[] args) {
        
        Television obj = new Electronic();
        obj.channel();
        obj.show();
    }
}
