package enumpackage;
enum Status{
    Running , Pending , Failed , Completed;
}

public class Enums {
    
    public static void main(String[] args) {
        
        Status s = Status.Running;   //.Pending, .Failed , .Completed
        System.out.println(s.ordinal());

        Status [] ss = Status.values();
        
        for(Status sn : ss){

            System.out.println(sn + " : " + sn.ordinal());
        }
    }
}
