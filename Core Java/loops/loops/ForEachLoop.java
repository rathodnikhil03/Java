class info{

    String name_of_student;
    int roll_no;
    int marks;
    
}


public class ForEachLoop {

    public static void main(String[] args) {

        
        int number[] = new int[5];
        number[0] = 55;
        number[1] = 45;
        number[2] = 35;
        number[3] = 25;
        number[4] = 15;

        for(int n : number){      //Enhanced for loop.
 
            System.out.println(n);
        }

        info s1 = new info();
        s1.name_of_student = "nikhil";
        s1.roll_no = 44;
        s1.marks = 800;

        info s2 = new info();
        s2.name_of_student = "aryan";
        s2.roll_no =19;
        s2.marks = 600;

        info s3 = new info();
        s3.name_of_student = "ankit";
        s3.roll_no = 60;
        s3.marks = 700;


        info s4 = new info();
        s4.name_of_student = "sahil";
        s4.roll_no = 59;
        s4.marks = 80;

        info output[]= new info[4];
        output[0] = s1;
        output[1] = s2;
        output[2] = s3;
        output[3] = s4;

        for(info n : output){
               
           System.out.println(n.name_of_student + " : " + n.roll_no + " : " + n.marks);

        }

    }
    
}
