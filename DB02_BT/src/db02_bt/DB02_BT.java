/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db02_bt;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DB02_BT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Scanner input = new Scanner(System.in);
            System.out.println("   QUIZ ONLINE   ");
            System.out.println("------------------");
            System.out.print("Enter Email: ");
            String email = input.nextLine();
            
            System.out.print("Enter Pass: ");
            String pass = input.nextLine();
            StudentManager sm = new StudentManager();
            
            boolean checkLogin = sm.login(email, pass);
            
            if (checkLogin) {
                System.out.println("LOGIN SUCCESS! PRESS ANY KEY TO START QUIZ");
                input.nextLine();
                System.out.println("--------");
                QuestionManager qm = new QuestionManager();
                List<Question> question = qm.getQuestion();
                
                int index=1;
                int indexQuestion=0;
                String answer;
                for(Question q : question){
                    System.out.printf("Question: %d/%d\n",index++,question.size() );
                    System.out.println(q);
                    System.out.print("YOur answer: ");
                    answer= input.nextLine();
                    if(answer.toLowerCase().equals(q.getCorrect())) indexQuestion++;
                }
                System.out.println("---------");
                System.out.println("Congratulation "); 
                System.out.printf("Your result: %d/ %d !",indexQuestion,question.size());
                
            } else {
                System.out.println("LOGIN FAIL!");
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
