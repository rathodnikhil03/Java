package project;
 

import java.util.Scanner;

public class QuestionService {
    
    Question [] questions = new Question[5];
    String selection[]  = new String[5]; 
    public QuestionService(){
    
        questions[0] = new Question(1, "Bytes size of int", "2", "4", "6", "8", "4");
        questions[1] = new Question(2, "Bytes size of long", "2", "4", "6", "8", "8");
        questions[2] = new Question(3, "Bytes size of float", "2", "4", "6", "8", "4");
        questions[3] = new Question(4, "Bytes size of double", "2", "4", "6", "8", "8");
        questions[4] = new Question(5, "Bytes size of char", "2", "4", "6", "8", "2");
        
    }

    public void playQuic(){

        int i = 0;
        for(Question q : questions){
            System.out.println("Question no : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            
            @SuppressWarnings("resource")
            Scanner sr = new Scanner(System.in);
            System.out.println("enter the answer :");
            selection[i] = sr.nextLine();
           
            
            i++;
            
        }
       
        for(String s : selection){

            System.out.println(s);
        }
    }
    
    public void calculateScore(){
       

        int score = 0;

        for(int i = 0; i <questions.length; i++)
        {
          Question que = questions[i];
          String autualAnswer = que.getAnswer();
          String userAnswer = selection[i];

          if(autualAnswer.equals(userAnswer)){
 
            score++;
         } 
        
        }
     System.out.println("Total socre is " + score + " / 5");
    } 
   
}
