/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class hinhBinhHanh extends daGiac{
    private float AB;
    private float BC;
    private float CD;
    private float DA;

    public float getAB() {
        return AB;
    }

    public void setAB(float AB) {
        this.AB = AB;
    }

    public float getBC() {
        return BC;
    }

    public void setBC(float BC) {
        this.BC = BC;
    }

    public float getCD() {
        return CD;
    }

    public void setCD(float CD) {
        this.CD = CD;
    }

    public float getDA() {
        return DA;
    }

    public void setDA(float DA) {
        this.DA = DA;
    }
    public void hinhBinhHanh(){
        
    }
    public void hinhBinhHanh(float a,float b,float c,float d){
        this.AB=a;
        this.BC=b;
        this.CD=c;
        this.DA=d;
    }
    
    public boolean testHinhBinhHanh(){
        return (AB== CD && BC == DA);
    }
    public void ChuVi(){
        float ChuVi;
        float duongCheo;
        ChuVi= 2*(AB+BC);
        System.out.println("Chu vi hinh binh hanh: "+ChuVi);
        float dienTich;
        duongCheo= (ChuVi/2)-AB-BC;
        float p=ChuVi/4;
        dienTich= (float)Math.sqrt((p)*(p-AB)*(p-BC)*(p-duongCheo));
        System.out.println("Dien tich hinh binh hanh: "+dienTich);
    }
}
