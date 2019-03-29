/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_08;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class soPhuc {
    private float phanThuc;
    private float phanAo;
    private float a;
    private float b;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
    public void setPhanThuc(float phanThuc){
        this.phanThuc=phanThuc;
    }
    public float getPhanThuc(){
        return this.phanThuc;
    }
    public void setPhanAo(float phanAo){
        this.phanAo=phanAo;
    }
    public float getPhanAo(){
        return this.phanAo;
    }
    Scanner in= new Scanner(System.in);
    public void inputInfo(){
        System.out.println("Nhap vao phan thuc: ");
        this.phanThuc=in.nextFloat();
        System.out.println("Nhap vao phan ao: ");
        this.phanAo=in.nextFloat();
        System.out.println("Nhap vao phan thuc 2: ");
        this.a=in.nextFloat();
        System.out.println("Nhap vao phan ao 2 : ");
        this.b=in.nextFloat();
    }
    
    public void printInfo(){
        System.out.println(" "+this.phanThuc+" va "+this.phanAo+"i");
    }
    public void add(){
        float real;
        float vitural;
        real= this.a+this.phanThuc; 
        vitural= this.b+this.phanAo;
        System.out.println("Cong 2 so phuc ("+this.a+"+"+this.b+"i + ("+this.phanThuc+" "+this.phanAo+"i)= "+real+"+"+vitural+"i");    
    }
    public void sub(){
        float real;
        float vitural;
        real= this.a-this.phanThuc; 
        vitural= this.b-this.phanAo;
        System.out.println("Tru 2 so phuc ("+this.a+"+"+this.b+"i + ("+this.phanThuc+"+"+this.phanAo+"i)= "+real+" "+vitural+"i");    
    }
    public void div(){
        float real;
        float vitural;
        real= this.a*this.phanThuc; 
        vitural= this.b*this.phanAo;
       System.out.println("Nhsn 2 so phuc ("+this.a+"+"+this.b+"i + ("+this.phanThuc+"+"+this.phanAo+"i)= "+real+" "+vitural+"i");    
    }
    public void mul(){
        float real;
        float vitural;
        float modul1;
        float modul;
        // xác dinh mau cua so thuc
        modul= (float)(Math.pow(this.a,2))+(float)(Math.pow(-(this.b),2));
        real= ((this.phanThuc*this.a)-((this.b)*this.phanAo))/modul;
        
        vitural= this.a*(this.phanAo) + this.phanAo*((this.b));
        vitural=vitural/modul;
        System.out.println("Chia 2 so phuc ("+this.a+"+"+this.b+"i + ("+this.phanThuc+"+"+this.phanAo+"i)= "+real+"+"+vitural+"i");    
    }
    
}
