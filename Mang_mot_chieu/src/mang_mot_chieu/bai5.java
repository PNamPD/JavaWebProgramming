/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang_mot_chieu;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class bai5 {
   
    public static void main(String[] args){
        int n=3;
        Scanner bc= new Scanner(System.in);
        
        Random rd = new Random(); 
        int[] vecToA = new int[n];
        int[] vecToB = new int[n];
        int[] vecToTong= new int[n];
        
        System.out.println("Toa do vecto a: ");
        for(int i=0;i<n;i++){
            vecToA[i]=rd.nextInt(50);
           System.out.print(" "+vecToA[i]);
        }
        System.out.println("");
        System.out.println("--------");
        System.out.println("Toa do vecto b: ");
        for(int i=0;i<n;i++){
            vecToB[i]=rd.nextInt(50);
            System.out.print(" "+vecToB[i]);
        }
        // cong 2 vecto
        for(int i=0;i<n;i++){
            vecToTong[i]= vecToA[i]+vecToB[i];
        }
        System.out.println("");
        System.out.println("-----");
        System.out.println("Tong 2 vecto: ");
        for(int i=0;i<n;i++){
            System.out.print(" "+vecToTong[i]);
        }
    }
}
