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
public class tamGiacDeu extends tamGiacCan{
    private float canh;
    public float getcanh(){
        return this.canh;
    }
    public void setcanh(float canh){
        this.canh=canh;
    }
    
    public tamGiacDeu(){
        
    }
    
    @Override
    public void chuVi(){
        float chuVi,dienTich;
        Scanner in= new Scanner(System.in);
        System.out.println("Nhap canh ");
        this.canh=in.nextFloat();
        chuVi= 3*this.canh;
        System.out.println("Chu vi tam giac deu: "+chuVi);
        dienTich= (float)Math.pow(this.canh, 2)/2;
        System.out.println("Dien tich tam giac deu: "+dienTich);
    }
}
