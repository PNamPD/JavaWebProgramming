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
// nhap vao mang 1 chieu 5 phan tu
// tim phan tu lon nhat
// tim phan tu nho nhat trong mang
// tat ca phan tu chia het cho 3
public class bai2 {
    public static void main(String[] args){
        int[] mangNguyen= new int[5];
        System.out.println("Nhap vao cac so nguyen: ");
        Scanner bc= new Scanner(System.in);
        for(int i=0;i<5;i++){
 /*           System.out.print("a["+(i+1)+"]= ");
            mangNguyen[i]= bc.nextInt();
                if(mangNguyen[i]<0){
                    System.out.print("Vui long nhap lai!");
                   
                }*/
                
            do{
               System.out.print("a["+(i+1)+"]= ");
               mangNguyen[i]= bc.nextInt();
               if(mangNguyen[i]<0){
                    System.out.println("Vui long nhap lai!"); 
            }
          }while(mangNguyen[i]<0);
        }
        int max=mangNguyen[0];
        int min=mangNguyen[0];
        for(int i=0;i<5;i++){
            if(mangNguyen[i]>max){
                max=mangNguyen[i];
            }
            if(mangNguyen[i]<min){
                min=mangNguyen[i];
            }
        }
        System.out.println("Max= "+max+" va Min "+min+"");
        
        System.out.println("Cac so chia het cho 3 = ");
        for(int i=0;i<5;i++){
            if(mangNguyen[i]%3==0){
                System.out.print(" "+mangNguyen[i]);
            }
        }
        
    }
}
