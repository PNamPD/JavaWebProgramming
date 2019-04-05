/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi9bt;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Student {
    private String id;
    private String name;
    private double mark;
    private String group;
    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getGroup() {
        String point;
        if(this.mark>8){
            point="Gioi";
        }
        else if(this.mark>6){
             point="Kha";
        }
        else if(this.mark>4){
             point="Trung Binh";
        }
        else  point="Yeu";
        return point;
    }

    public void setGroup(String group) {
        
        this.group= group;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Student(){
        
    }
    public Student(String id, String name, double mark, String phone){
        this.id=id;
        this.mark=mark;
        this.name=name;
        this.phone=phone;
    }
 /*   @Override
    public String toString() {
        return "Student{" + "id=" + this.id + ", name=" +  this.name + ", mark=" + this.mark + ", phone=" + this.phone +  '}';
    } */
    public Student(String id, String name, double mark, String group, String phone){
        this.id=id;
        this.group=group;
        this.mark=mark;
        this.name=name;
        this.phone=phone;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + this.id + ", name=" + this.name + ", mark=" + this.mark + ", group=" + this.getGroup() + ", phone=" + this.phone + '}';
    }
    private boolean flag;
    
    public void inputInfo(){
        Scanner in = new Scanner(System.in);
        String b;

        flag=true;
/*        for(int i=0;i<2;i++){
            System.out.println(" "+this.id+i);
            contain=this.id+i;
        }
        do{
            if(contain.equals(a)){
                System.out.println("Nhap lai!");
                flag=false;
            }
        }while(flag==false);*/
        do{
            flag=true;
            
            System.out.print("Nhap vao ma id: ");
            this.id= in.nextLine();
            
            if(!this.id.startsWith("HV")){
                System.out.println("Nhap lai hoc vien bat dau HV");
                flag=false;
            }
            int calculate=0;
            try{
                for(int i=this.id.length()-1;i>1;i--){
                    // ham nay kiem tra chu ki tu co phai chu so khong
                    // ki tu dua vao la so se k sao
                    // ki tu dua vao ma la ki tu thi se in ra nhap chu so
                    if(Character.isLetter(this.id.charAt(i))){
                        System.out.println("Nhap vao chu so!");
                        flag=false;
                        
                    }
                    calculate++;
                }
            }catch(Exception e){
                System.out.println("Loi dang nhap!");
                flag=false;
            }
//            System.out.println(" "+calculate);
            if(this.id.length()>5 || calculate<3 ){
                System.out.println("Vui long nhap lai!");
                flag=false;
            }
        }while(flag==false);
        do{
            flag =true;
            try{
            System.out.print("Nhap vao ten hoc vien: ");
            this.name= in.nextLine();
            if(this.name.length()<5){
                System.out.println("Sai ten vui long nhap lai!");
                flag=false;
            }
            }catch(Exception e){
                System.out.println("Nhap dung ki tu!");
            }  
        }while(!flag);
        do{
            try{
                flag=true;
                System.out.print("Nhap vao diem hoc vien: ");
                this.mark= in.nextDouble();
                if(this.mark>10 || this.mark<0){
                    System.out.println("Nhap lai diem tu 0 den 10");
                    flag=false;
                }
            }catch(Exception e){
                System.out.println("VUi long nhap so");
                flag=false;
            }
            in.nextLine();
        }while(!flag);
/*        do{
            flag=true;
            try{
                System.out.println("Nhap vao diem hoc vien: ");
                this.group= Integer.parseInt(in.nextLine());  
            }catch(NumberFormatException e1){
                System.out.println("Vui  long nhap lai!");
                flag=false;
            }
            
        }while(!flag);*/
        do{
            
            flag=true;
            try{
                System.out.println("Nhap vao so dien thoai: ");
                this.phone= in.nextLine();
                if(this.phone.length()>12){
                    System.out.println("Vui long nhap  duoi 10 so!");
                    flag=false;
                    break;
                }
            }catch(Exception e){
                System.out.println("Vui long nhap lai!");
                flag=false;
            }
        }while(!flag);
    }
    
        
    
    
}
