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
public class demo12 {

    public static void main(String[] args){
        daGiac test = new daGiac();
        float a,b;
        Scanner sc= new Scanner(System.in);
        int choice;
        System.out.println("Chon tinh dien tich hinh:");
        System.out.println("1.Hinh binh hanh");
        System.out.println("2.Hinh chu nhat");
        System.out.println("3.Hinh vuong:");
        choice = sc.nextInt();
        switch(choice){
            case 1: {
                test = new HinhBinhHanh();
                break;
            }
            case 2: {
                test= new HinhChuNhat();
                break;
            }
            case 3: {
                test= new HinhVuong();
                break;
            }
        }
        System.out.println("Nhap canh a: ");
        a=sc.nextFloat();
        System.out.println("Nhap canh b: ");
        b=sc.nextFloat();
        test.tinhChuVi(a,b);
        test.tinhDienTich(a,b);
    }
}
