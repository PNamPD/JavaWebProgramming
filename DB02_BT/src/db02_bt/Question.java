/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db02_bt;

/**
 *
 * @author ASUS
 */
public class Question {
    private int id;
    private String content;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String correct;
    public Question(){
        
    }
    public Question(int id, String answerA, String answerB, String answerC,String answerD){
        this.id=id;
        this.answerA= answerA;
        this.answerA= answerB;
        this.answerA= answerC;
        this.answerA= answerD;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.content);
        builder.append("\nA. "+this.answerA);
        builder.append("\nB. "+this.answerB);
        builder.append("\nC. "+this.answerC);
        builder.append("\nD. "+this.answerD);
        builder.append("\n");
        
        return builder.toString();
    }
    
}
