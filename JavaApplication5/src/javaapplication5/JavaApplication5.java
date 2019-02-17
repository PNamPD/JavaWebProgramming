/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {

    
    public static void main(String[] args) {
        double a,b;
        // inout tu dat duoc HaHa thay doi duoc
        Scanner HaHa= new Scanner(System.in);
        System.out.print("Nhap a> ");
        a=HaHa.nextFloat();
        System.out.print("Nhap b> ");
        b=HaHa.nextFloat();
        if(a>b){
            System.out.println("a>b");
        }
        else System.out.println("a<b");
        String kq=(a>b) ? "a>b" : "a<b";
        System.out.print("Ket qua "+kq);
        // giong cau duoi kq
//        System.out.print(kq);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("\n");
        System.out.println("Doi gia tri 2 so a = "+a+" va b= "+b+"");
                
        if(a%2==0){
            System.out.println("a la gia tri chan!");
        }
        else {
            System.out.println("a la gia tri le!");
        }
        int n;
        System.out.print("Gia tri n= ");
        n=HaHa.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                
            }
            System.out.println("");     
    }
    
    
}
