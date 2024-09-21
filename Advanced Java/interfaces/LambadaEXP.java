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
