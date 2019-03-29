/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_03;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class demo2 {
    public static void main(String[] args){
        int n;
        
        Scanner bc= new Scanner(System.in);
        System.out.print("Nhap vao so luong hoc vien: ");
        n=bc.nextInt();
        HocBong[] a= new HocBong[n];
        for(int i=0;i<n;i++){
            HocBong test= new HocBong();
            test.inputInfo();
            a[i]= test;
        }
        for(int i=0;i<n;i++){
            a[i].Test();
        }
    }   
}
