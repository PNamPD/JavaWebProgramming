/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class bai5 {
    public static void main(String[] args){
        Scanner bc = new Scanner(System.in);
        int m=4;
        int n=6;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==m-1){
                for(int k=0;k<n;k++){
                    System.out.print("*");
                }
                break;
            }
                else if(j==0 || j==n-1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
             System.out.println("");
        }
        
    }
}
