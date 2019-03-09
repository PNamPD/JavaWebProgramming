/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_03;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class HocBong {
    String Name;
    int Registration; // dang ki hoc o HDSE
    int finalGrade; // diem tong
    int Foul; // loi khi tham gia hoc
    int Exam; // bai kiem tra
    
    public void Name(String Name){
        this.Name=Name;
    }
    public String Name(){
        return this.Name;
    }
    public void Registration(int Registration){
        this.Registration=Registration;
    }
    public int Registration(){
        return this.Registration;
    }
    public void finalGrade(int finalGrade){
        this.finalGrade = finalGrade;
    }
    public int finalGrade(){
        return this.finalGrade;
    }
    public void Foul(int Foul){
        this.Foul=Foul;
    }
    public int Foul(){
        return Foul;
    }
    public void Exam(int Exam){
        this.Exam= Exam;
    }
    public int Exam(){
        return Exam;
    }
    Scanner in= new Scanner(System.in);
    public void inputInfo(){
        System.out.println("Nhap vao ten hoc sinh: ");
        this.Name=in.nextLine();
        
        do{
            System.out.println("Co dang ki khoa hoc khong: ");
            System.out.println("Xin moi chon 1- CO   2- KHONG");
            this.Registration= in.nextInt();
            if(this.Registration <1 || this.Registration >2){
                System.out.println("Vui long nhap lai");
            }
        }while(this.Registration<1 || this.Registration>2);
        do{
            System.out.println("CO diem tong lon hon 8.5 ");
            System.out.println("Xin moi chon 1- CO   2- KHONG");
            this.finalGrade= in.nextInt();
            if(this.finalGrade<1 || this.finalGrade>2){
                System.out.println("Vui long nhap lai");
            }
        }while(this.finalGrade<1 || this.finalGrade>2);
        do{
            System.out.println("Co mac loi trong qua trionh hoc tap: ");
            System.out.println("Xin moi chon 1- CO   2- KHONG");
            this.Foul= in.nextInt();
            if(this.Foul<1 || this.Foul>2){
                System.out.println("Vui long nhap lai");
            }
        }while(this.Foul<1 || this.Foul>2);
        do{
            System.out.println("Cac ki thi chi thi mot lan ");
            System.out.println("Xin moi chon 1- CO   2- KHONG");
            this.Exam= in.nextInt();
            if(this.Exam <1 || this.Exam > 2){
                System.out.println("Vui long nhap lai");
            }
        }while(this.Exam <1 || this.Exam> 2);
    }
    public void Test(){
        if(this.Exam==1 && this.Foul==1 && this.Foul==1 &&this.Registration==1 &&this.finalGrade==1){
            System.out.println("Sinh vien "+this.Name+" dat hoc bong!");
        }
        else System.out.println("Sinh vien "+this.Name+" phai dong hoc phi!");
    }
    
    
}
