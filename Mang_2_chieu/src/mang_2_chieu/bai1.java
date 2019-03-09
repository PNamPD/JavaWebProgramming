/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang_2_chieu;

import java.util.Scanner;
        
/**
 *
 * @author ASUS
 */
public class bai1 {
    public static void main(String[] args){
        Scanner bc = new Scanner(System.in);
        int Matrix[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("a["+i+"]["+j+"]= ");
                Matrix[i][j] = bc.nextInt();
                
            }
            
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+Matrix[i][j]);
            }
            System.out.println("");
        }
        int tong=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                tong+=Matrix[i][j];
            }
            System.out.println("TOng dong "+(i+1)+" la "+tong+"");
            tong=0;
        }
         tong=0;
        for(int j=0;j<3;j++){
            for(int i=0;i<3;i++){
                tong+=Matrix[i][j];
            }
            System.out.println("TOng cot "+(j+1)+" la "+tong+"");
            tong=0;
        }
    }
}
