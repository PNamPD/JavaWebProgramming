/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_12;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class HinhVuong extends HinhChuNhat{
    private float a;
    public float getAa() {
        return a;
    }

    public void setAa(int a) {
        this.a = a;
    }
    @Override
    public void tinhChuVi(float a,float b){
        float CV=(a+b)*2;
        System.out.println("Chu vi hinh VUONG: "+CV);     
    }
    @Override
    public void tinhDienTich(float a,float b){
        float DT=a*b;
        System.out.println("Dien tich hinh VUONG: "+DT);
    }
    
}
