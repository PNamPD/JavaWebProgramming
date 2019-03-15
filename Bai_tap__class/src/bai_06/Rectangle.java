/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_06;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Rectangle {
    private int dai;
    private int rong;
    public void setDai(int dai){
        this.dai=dai;
    }
    public int getDai(){
        return this.dai;
    }
    public void setRong(int rong){
        this.rong=rong;
    }
    public int getRong(){
        return this.rong;
    }
    Scanner in= new Scanner(System.in);
   public void inputInfo(){
       do{
           System.out.println("Nhap vao chieu dai: ");
           this.dai=in.nextInt();
           if(this.dai<0){
               System.out.println("Vui long nhap lai!");
           }
       }while(this.dai<0);
       do{
           System.out.println("Nhap vao chieu rong: ");
           this.rong=in.nextInt();
           if(this.rong<0){
               System.out.println("Vui long nhap lai!");
           }
       }while(this.rong<0);
   }
   public void perimeter(){
       int chuVi;
       chuVi=(this.dai+this.rong)*2;
       int dienTich;
       dienTich=this.dai*this.rong;
       System.out.println("Hinh chu nhat co dien tich: "+dienTich+" va chu vi: "+chuVi);
   }
}
