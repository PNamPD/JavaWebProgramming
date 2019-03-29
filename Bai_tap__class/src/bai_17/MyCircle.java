/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_17;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MyCircle extends MyPoint{
    Scanner sc= new Scanner(System.in);
    public static final double pi=3.14;
    private int R;
    private MyPoint p;
    public int b;
    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }

    public MyPoint getP() {
        return p;
    }

    public void setP(MyPoint p) {
        this.p = p;
    }
    public MyCircle(int a,int b,int R){
        this.x=a;
        this.y=b;
        this.R=R;
    }
    public MyCircle(){
        
    }
    public void Info(){
        System.out.print("Nhap vao x= ");
        this.x=sc.nextInt();
        System.out.print("Nhap vao y= ");
        this.y=sc.nextInt();
        System.out.print("Nhap vao ban kinh: ");
        this.R=sc.nextInt();
    }

    
    @Override
    public String toString(){
        return "Hinh tron @("+this.x+","+this.y+") ban kinh = "+this.R+" va Dien tich: "+this.getArea();
    }
    public double getArea(){
        return (pi*this.R);
    }
    
}
