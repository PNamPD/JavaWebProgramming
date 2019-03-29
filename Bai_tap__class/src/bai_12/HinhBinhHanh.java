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
public class HinhBinhHanh extends daGiac{
    private float canhDay,canhBen;
    
    public float getCanhDay() {
        return canhDay;
    }

    public void setCanhDay(float canhDay) {
        this.canhDay = canhDay;
    }

    public float getCanhBen() {
        return canhBen;
    }

    public void setCanhBen(float canhBen) {
        this.canhBen = canhBen;
    }

    
    
    @Override
    public void tinhChuVi(float canhDay,float canhBen){
        float CV;
        CV= (canhDay+canhBen)*2;
        System.out.println("Chu vi hinh binh hanh: "+CV);   
    }
    @Override
    public void tinhDienTich(float canhDay,float canhBen){
        Scanner in= new Scanner(System.in);
        System.out.println("Nhap chieu cao: ");
        float h;
        h=in.nextFloat();
        float DT = (canhDay*h)/2;
        System.out.println("Dien tich hinh binh hanh: "+DT);
    }
    
}
