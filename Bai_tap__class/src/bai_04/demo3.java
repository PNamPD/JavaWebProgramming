/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_04;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class demo3 {
    public static void main(String[] args){
        int n,b;
        System.out.print("Nhao vao so n= ");
        Scanner bc= new Scanner(System.in);
        n= bc.nextInt();
        SoNguyenTo k= new SoNguyenTo();
        b=k.timSoNguyenToTiepTheo(n);
        System.out.println("so nguyen to: "+b);
    }
}
