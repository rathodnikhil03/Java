package object;
public class ClassesAndObjects {

    public static void main(String[] a){

        class number{

            int num;

            public boolean ispositive(){

                if(num > 0){
                    return true;
                }else{
                    return false;
                }
            }

        }
        number no1 = new number();
        no1.num = -19;
        if(no1.ispositive()){
        System.out.println("number is positive");
        }else{
            System.out.println("number is negative");
        }


    }
    
}
