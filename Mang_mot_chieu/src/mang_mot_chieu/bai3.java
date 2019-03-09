/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang_mot_chieu;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class bai3 {
    public static void main(String[] args){
        // khai bao cai nay de luu bien
        Scanner bc = new Scanner(System.in);
        // khai bao mang mot chieu
        int[] mangNguyen= new int[5];
        for(int i=0;i<5;i++){
            do{
                System.out.print("a["+i+"]= ");
                mangNguyen[i]=bc.nextInt();
                if(mangNguyen[i]<0){
                    System.out.println("Vui long nhap lai!");
                }
            }while(mangNguyen[i]<0);
        }
        int a;
        // khai bao bien a
        System.out.print("a= ");
        a=bc.nextInt();
        int flag=0;
        for(int i=0;i<5;i++){
            if(mangNguyen[i]==a){
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("Co phan tu "+a+" trong mang");
            System.out.println("No xuat hien o vi tri");
        for(int i=0;i<5;i++){
            if(mangNguyen[i]==a){
                System.out.print(" "+i);
            }
          }
        }
        else System.out.print("Khong co phan tu trong mang");
      
    }
}
