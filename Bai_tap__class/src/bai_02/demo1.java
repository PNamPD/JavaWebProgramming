/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_02;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class demo1 {
     public static void main(String[] args){
        int n;
        System.out.println("Nhap vao co tat ca bao nhieu hoc sinh: ");
        Scanner bc = new Scanner(System.in);
        n= bc.nextInt();
        Student[] a= new Student[n];
        for(int i=0;i<n;i++){
            Student test= new Student() ;
            System.out.println("Nhap vao thong tin nguoi dung thi "+(1+i)+"!");
            test.inputInfo();
            a[i]=test;
        }
        for(int i=0;i<n;i++){
            a[i].printInfo();
            a[i].scholarship();
        }
     }
}
