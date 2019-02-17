/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
// lap chuong trinh tinh sin(x) voi do chinh xasc  0.0001 theo cong thuc
// sin(x)=  x -x^3/3! + x^5/5! + (-1)^n*x^(2n+1)/(2n+1)!
public class bai1 {
    public static void main(String[] args){
        int n,x;
        float tong=0;
        float tu=0;
        Scanner jv= new Scanner (System.in);
        System.out.println("Nhap n= ");
        n=jv.nextInt();
        System.out.println("Nhap x= ");
        x=jv.nextInt();
        for(int i=0;i<n;i++){
            tu+=pow(-1,i)*pow(x,2*i+1);
            float giaiThua = 0;
            tong+=tong+tu/(giaiThua);
        }
    }
     public static int giaiThua(int n){
        int giaithua=1;
        if(n== 0 || n==1 ) return 1;
        for(int i=1;i<=n;i++){
            giaithua=giaithua*i;
        }
        return giaithua;
    }
    
}
