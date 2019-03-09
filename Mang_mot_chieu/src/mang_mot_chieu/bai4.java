/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang_mot_chieu;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ASUS
 */
public class bai4 {
    public static void main(String[] args){
        Scanner bc = new Scanner(System.in);
        int[] mangNguyen = new int[15];
        Random rd= new Random();
        for(int i=0;i<15;i++){
            mangNguyen[i]= rd.nextInt(100);
        }
        for(int i=0;i<14;i++){
            for(int j=i+1;j<15;j++){
                if(mangNguyen[i]>mangNguyen[j]){
                    int temp;
                    temp=mangNguyen[i];
                    mangNguyen[i]=mangNguyen[j];
                    mangNguyen[j]=temp;
                }
            }
        }
        System.out.println("Mang tang dan: ");
        for(int i=0;i<15;i++){
            System.out.print(" "+mangNguyen[i]);
        }
        // mang giam dan
        for(int i=0;i<14;i++){
            for(int j=i+1;j<15;j++){
                if(mangNguyen[i]<mangNguyen[j]){
                    int temp;
                    temp=mangNguyen[i];
                    mangNguyen[i]=mangNguyen[j];
                    mangNguyen[j]=temp;
                }
            }
        }
        System.out.println("");
        System.out.println("Mang giam dan: ");
        for(int i=0;i<15;i++){
            System.out.print(" "+mangNguyen[i]);
        }
        int demChan=0;
        int demLe=0;
        for(int i=0;i<15;i++){
            if(mangNguyen[i]%2==0){
                demChan++;
            }
            else demLe++;
        }
        System.out.println("");
        System.out.println("SO luong so chan la "+demChan+" va so le la "+demLe+"!");
        
        
    }
}
