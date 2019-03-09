/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_05;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class demo5 {
    public static void main(String[] args){
        int a,b,c;
        Triangle test= new Triangle();
        Scanner in= new Scanner(System.in);
        do{
            System.out.println("Nhap vao canh a= ");
            a=in.nextInt();
            if(a<=0){
                System.out.println("Vui long nhap lai!");
            }
        }while(a<=0);
        do{
            System.out.println("Nhap vao canh b= ");
            b=in.nextInt();
            if(b<=0){
                System.out.println("Vui long nhap lai!");
            }
        }while(b<=0);
        do{
            System.out.println("Nhap vao canh c= ");
            c=in.nextInt();
            if(c<=0){
                System.out.println("Vui long nhap lai!");
            }
        }while(c<=0);      
        test.xacDinh(a,b,c);
        
    }
}
