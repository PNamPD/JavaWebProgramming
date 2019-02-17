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
public class bai5 {
    public static void main(String[] args){
        int m=4,n=8;
        System.out.println("Bai 5.1:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Bai 5.2:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==m-1){
                    System.out.print("*");
                }
                else if(j==0 || j==n-1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
