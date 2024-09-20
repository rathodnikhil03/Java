package enumpackage;
enum Coding{
    Code , Complie , Error , Run;
}


public class EnumIfElseIfAndSwitch {
    
    public static void main(String[] args) {
        
        Coding c = Coding.Code;

        if(c == Coding.Code){
            System.out.println("Write a code");
        }else if(c == Coding.Complie){
            System.out.println("Complie the code");
        }else if(c == Coding.Error){
            System.out.println("Error in the code");
        }else{
            System.out.println("Run the code");
        }

        Coding cs = Coding.Run;

        switch (cs) {
            case Code:
             System.out.println("Write a code");
                break;
            case Complie:
             System.out.println("Complie the code");
                break;
            case Error:
             System.out.println("Error in the code");
                break;
                   
            default:
             System.out.println("Run the code");
                break;
        }
    }
}
