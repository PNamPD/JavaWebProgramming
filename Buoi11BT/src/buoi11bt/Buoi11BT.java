/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi11bt;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Buoi11BT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomerManager cm = new CustomerManager();
        int choice=0;
        int tk=0;
        Scanner bc = new Scanner(System.in);
        do{
            System.out.println("Moi ban nhap:");
            System.out.println("1.Them vao: ");
            System.out.println("2.TIm kiem: ");
            
            System.out.println("5.Exit!");
            choice = bc.nextInt();
            switch(choice){
                case(1) : {
                    cm.add();
                    break;
                }
                case(2) : {
                    System.out.println("ID tim kiem: ");
                    tk= bc.nextInt();
                    cm.search(tk);
                    Customer demo= new Customer();
                    demo = cm.search(tk);
                    System.out.println(demo);
                    break;
                }
            }
            
        }while(choice!=5);
        
    }
    
}
