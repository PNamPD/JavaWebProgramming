/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_1_2019;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // mo them class import.jave util.Scanner -> vao in
        // tinh binh phuogn cua 1 so
        Scanner inout= new Scanner(System.in);
        // dua ra man hinh 
        System.out.println("Nhap so can nhap: ");
        // gan vao bien num kieu int
        int num = inout.nextInt();
        // thuat toan giong c
        num=num*2;
        System.out.println("Ket qua: "+num);
        
            
    }
    
}
