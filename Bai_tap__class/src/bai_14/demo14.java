/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_14;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class demo14 { 


    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        tamGiac a= new tamGiac();
        int choice;
        System.out.println("Ban muon tinh tam giac nao!");
        System.out.println("1. Tam giac can");
        System.out.println("2. Tam giac deu");
        System.out.println("3. Tam giac vuong");
        System.out.print("Moi ban nhap:   ");
        choice = in.nextInt();
        switch(choice){
            case(1): {
                a = new tamGiacCan();
                break;
            }
            case(2): {
                a= new tamGiacDeu();
                break;
            }
            case(3): {
                a= new tamGiacVuong();
            }
        }
        a.chuVi();
        
    }
    
    
    
}
