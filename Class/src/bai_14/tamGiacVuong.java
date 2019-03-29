/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_14;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class tamGiacVuong extends tamGiac{
    private float canh1,canh2;
    private float vuong;

    public float getCanh() {
        return canh1;
    }

    public void setCanh(float canh) {
        this.canh1 = canh;
    }
    public float getCanh2() {
        return canh2;
    }

    public void setCanh2(float canh) {
        this.canh2 = canh;
    }
    public float getDay() {
        return vuong;
    }

    public void setDay(float day) {
        this.vuong = day;
    }
    public tamGiacVuong(){
        
    }
    public tamGiacVuong(float canh,float vuong,float canh2){
        this.canh2=canh2;
        this.canh1=canh;
        this.vuong=vuong;
    }
    @Override
    public void chuVi(){
        Scanner in= new Scanner(System.in);
        System.out.println("Nhap canh day: ");
        this.canh1 = in.nextFloat();
        System.out.println("Nhap canh ben: ");
        this.canh2= in.nextFloat();
        System.out.println("Nhap canh huyen: ");
        this.vuong=in.nextFloat();
        float chuVi,dienTich;
        chuVi= this.canh1+this.canh2+this.vuong;
        System.out.println("Chu vi tam giac can: "+chuVi);
        dienTich= this.canh1*this.vuong;
        System.out.println("Dien tich tam giac can: "+dienTich);
        
    }
    
    
}
