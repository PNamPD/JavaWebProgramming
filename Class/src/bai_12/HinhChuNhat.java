/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_12;

/**
 *
 * @author ASUS
 */
public class HinhChuNhat extends HinhBinhHanh{
    private float a,b;

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
    

    
    public HinhChuNhat(){
        
    }
    public HinhChuNhat(float a,float b){
        this.a=a;
        this.b=b;
    }
    @Override
    public void tinhChuVi(float a,float b){
        System.out.println("haha");
        float CV=(a+b)*2;
        System.out.println("Chu vi hinh CHU NHAT: "+CV);        
    }
    @Override
    public void tinhDienTich(float a,float b){
        float DT=a*b;
        System.out.println("Dien tich hinh CHU NHAT: "+DT);
    }
    
    
    
}
