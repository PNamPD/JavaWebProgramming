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
        System.out.println("Nhap a= ");
        a= in.nextInt();
        System.out.println("Nhap b= ");
        b= in.nextInt();
        System.out.println("Nhap c= ");
        c= in.nextInt();
        
        test.xacDinh(a,b,c);
        
    }
}
