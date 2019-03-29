/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_02;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Student {
    // khai bao cac thuoc tinh
    private String studentCode;
    private float mediumscore;
    private int age;
    private String Lop;
    Scanner in= new Scanner(System.in);
    int flag;
    public Student(){
        
    }
    public void setStudentCode(String studentCode){
        this.studentCode=studentCode;   
    }
    public String getStudentCode(){
        return studentCode;
    }
    public void setMediumsCode(float mediumcore)
    {
        this.mediumscore= mediumcore;
    }
    public float getMediumsCode(){
         return mediumscore;
    }
    public void setAge(int age){
        this.age= age;
    }
    public int getAge(){
        return age;
    }
    // lay ham trong class
    public void setClass(String Classs){
        this.Lop=Classs;
    }
    public String getClasss(){
        return Lop;
    }
    public void inputInfo(){
        
        do{
            System.out.print("Ma sinh vien: ");
            this.studentCode= in.nextLine();
            
            if(this.studentCode.length()>8){
                System.out.println("Vui long nhap lai ki tu duoi 8!");
            }
        }while(this.studentCode.length()>8);
        do{
            System.out.print("Tuoi: ");
            this.age=Integer.parseInt(in.nextLine());
            if(this.age<18){
                System.out.println("Vui long nhap tuoi lon hon 18!");
            }
        }while(this.age<18);
        do{
            System.out.print("Diem trung binh: ");
            this.mediumscore=in.nextFloat();
            in.nextLine();
            if(this.mediumscore<0 || this.mediumscore>10){
                System.out.println("vui long nhap lai diem lon hon 0 va duoi 10!");
            }
        }while(this.mediumscore<0 || this.mediumscore>10);
        
 /*           System.out.println("Lop: ");
            this.Lop=in.nextLine();
            char index1 = this.Lop.charAt(0);
            System.out.println(" "); */
            
        do{
            System.out.println("Lop: ");
            this.Lop=in.nextLine();
            String s1 = "A";
            String s2=  "C";
            // lay vi tri dau tien trong String Classs
            char index1 = this.Lop.charAt(0);
            // doi char snag String
            String s3= Character.toString(index1);
            // tao bien so sanh chu cai dau voi A va C
            boolean result,result1;
             result = s3.equals(s1);
            result1 = s3.equals(s2);
            
            if((s3.equals(s1)) || (s3.equals(s2))){
               flag=1;
            }
            else flag=0;
            if(flag==0){
                System.out.println("Vui long nhap lai!");
            }
        }while(flag==0); 
    }        
    public void printInfo(){
         System.out.println("Thong tin nguoi dung:");
         System.out.println("----------");
         System.out.println("Ma sinh vien: "+this.studentCode+" diem trung binh: "+this.mediumscore);
         System.out.println("Tuoi "+this.age+" va "+this.Lop);
    }
    public void scholarship(){
        if(this.mediumscore>8){
            System.out.println("Sinh vien "+this.studentCode+" duoc nhan hoc bong!");
        }
        else System.out.println("Sinh vien "+this.studentCode+" phai dong hoc phi!");
    }
}
