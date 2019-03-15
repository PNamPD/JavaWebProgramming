/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_09;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class vecTo {
    private int hoanhDoDau;
    private int tungDoDau;
    private int hoanhDoCuoi;
    private int tungDoCuoi;
    private int a;
    private int b;
    private int c;
    private int d;

    public int getHoanhDoDau() {
        return hoanhDoDau;
    }

    public void setHoanhDoDau(int hoanhDoDau) {
        this.hoanhDoDau = hoanhDoDau;
    }

    public int getTungDoDau() {
        return tungDoDau;
    }

    public void setTungDoDau(int tungDoDau) {
        this.tungDoDau = tungDoDau;
    }

    public int getHoanhDoCuoi() {
        return hoanhDoCuoi;
    }

    public void setHoanhDoCuoi(int hoanhDoCuoi) {
        this.hoanhDoCuoi = hoanhDoCuoi;
    }

    public int getTungDoCuoi() {
        return tungDoCuoi;
    }

    public void setTungDoCuoi(int tungDoCuoi) {
        this.tungDoCuoi = tungDoCuoi;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
    Scanner in= new Scanner(System.in);
    public void inputInfo(){
        System.out.print("Nhap vao hoanh do dau 1: ");
        this.hoanhDoDau=in.nextInt();
        System.out.print("Nhap vao hoanh do cuoi 1: ");
        this.hoanhDoCuoi=in.nextInt();
        System.out.print("Nhap vao tung do dau 1: ");
        this.tungDoDau=in.nextInt();
        System.out.print("Nhap vao tung do cuoi 1: ");
        this.tungDoCuoi=in.nextInt();
        System.out.print("Nhap vao hoanh do dau 2: ");
        this.a=in.nextInt();
        System.out.print("Nhap vao hoanh do cuoi 2: ");
        this.b=in.nextInt();
        System.out.print("Nhap vao tung do dau 2: ");
        this.c=in.nextInt();
        System.out.print("Nhap vao tung do cuoi 2: ");
        this.d=in.nextInt();
    }
    
    
}
