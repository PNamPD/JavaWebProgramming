/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12bt;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class StudentManager {
    private List<Student> List;
    public StudentManager(){
        this.List= new ArrayList<>();
    }
    public void add(){
        Date demo= new Date();
        Scanner sc= new Scanner(System.in);
        Student a= new Student();
        System.out.println("Nhap vao sdt: ");
        a.setRollnumber(sc.nextLine());
        System.out.println("Nhap vao ten: ");
        a.setEmail(sc.nextLine());
        System.out.println("Nhap vao ngay: ");
        demo.setDay(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap vao thang: ");
        demo.setMonth(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap vao nam: ");
        demo.setYear(Integer.parseInt(sc.nextLine()));
        a.setDob(demo);
        System.out.println("Nhap vao email: ");
        a.setEmail(sc.nextLine());
        List.add(a);
        
    }
    public boolean search (String name){
        
        boolean ct =List.equals(name);
        
        if(ct){
            return true;
        }
        return false;
        
    }
    public void update(){
        System.out.println("Ban muon thay doi thong tin ");
        System.out.println("Nhap vao ten cai update: ");
        Scanner in= new Scanner(System.in);
        String info= in.nextLine();
        int choice=0;
        for(Student name : List){
            if(search(info)){
                System.out.println("Ban muon thay doi thong tin hoc sinh nay khong? 1/0");
                System.out.println(name);
                if(choice==1){
                    Date demo= new Date();
                Scanner sc= new Scanner(System.in);
                Student a= new Student();
                System.out.print("Nhap vao sdt: ");
                a.setRollnumber(sc.nextLine());
                System.out.print("Nhap vao ten: ");
                a.setEmail(sc.nextLine());
                System.out.print("Nhap vao ngay: ");
                demo.setDay(Integer.parseInt(sc.nextLine()));
                System.out.print("Nhap vao thang: ");
                demo.setMonth(Integer.parseInt(sc.nextLine()));
                System.out.print("Nhap vao nam: ");
                demo.setYear(Integer.parseInt(sc.nextLine()));
                a.setDob(demo);
                System.out.print("Nhap vao email: ");
                a.setEmail(sc.nextLine());
                List.set(List.indexOf(name), a);
                }
                else break;
                
            }
        }
    }
    public void delate(){
        System.out.println("Nhap phan tu muon xoa:");
        Scanner in= new Scanner(System.in);
        String info= in.nextLine();
        if(search(info)){
            List.remove(List.indexOf(info));
            System.out.println("Da xoa thanh cong!");
        }
    }
    public void readFile() {
        try{
            File f= new File("E:\\customer\\Man.txt");
            FileOutputStream fos= new FileOutputStream(f) ;
            
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
}
