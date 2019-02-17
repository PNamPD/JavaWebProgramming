/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_6;

/**
 *
 * @author ASUS
 */
public class bai4 {
    public static void main(String[] agrs){
       int h=4;
        System.out.println("Bai 4.1:");
       for(int i=0;i<h;i++){
           for(int k=h-i-1;k>=0;--k){
               System.out.print(" ");
           }
           for(int j=0;j<(2*i+1);j++){
               System.out.print("*");
           }
           System.out.println();
       }
        System.out.println("Bai 4.2:");
        for(int i=0;i<h;i++){
           for(int k=h-i-1;k>=0;--k){
               System.out.print(" ");
           }
           for(int j=0;j<(2*i+1);j++){
               if(i==0 || i==h-1){
                   System.out.print("*");
               }
               else if(j==0 || j==2*i){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println("");
       }
        
    }
}
