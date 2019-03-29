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
public class tamGiacCan extends tamGiac{
    private float canh;
    private float day;
    public tamGiacCan(){
        
    }
    public tamGiacCan(float canh, float day){
        this.canh=canh;
        this.day=day;
    }
    public float getCanh(){
        return this.canh;
    }
    public void setCanh(float canh){
        this.canh=canh;
    }
    public float getDay(){
        return this.day;
    }
    public void setDay(float day){
        this.day=day;
    }
    
    @Override
    public void chuVi(){
        float chuVi;
        float dienTich,h;
        Scanner in= new Scanner(System.in);
        System.out.println("Nhap canh ben: ");
        this.canh = in.nextFloat();
        System.out.println("Nhap canh day: ");
        this.day=in.nextFloat();
        chuVi= (canh*2)+day;
        System.out.println("Chu vi tam giac Can: "+chuVi);
        System.out.println("Nhap vao chieu cao: ");
        h= in.nextFloat();
        dienTich= (this.day*h)/2;
        System.out.println("Dien tich tam giac Can: "+dienTich);
    }
    
    
}
