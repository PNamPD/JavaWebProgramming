/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi9bt;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Buoi9BT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentManager demo= new StudentManager();
        int choice=0;
        Scanner in = new Scanner(System.in);
        do{
            try{
            System.out.println("--THONG TIN -----");
            System.out.println("1.Them THong Tin");
            System.out.println("2. In ra thong tin");
            System.out.println("3. TOP 3:");
            System.out.println("4. Exit");
                System.out.print("Moi ban nhap: ");
                choice=in.nextInt();
                
            }catch(Exception e){
                System.out.println("Nhap lai so");
                choice=0;
            }
            switch(choice){
            case(1): {
                demo.add();
                break;
            }
            case(2): {
                demo.show();
                break;
            }
            case(3): {
                demo.top();
                break;
            }
            case(4): {
                System.exit(0);
                break;
            }
        }
            
        }while(choice<4 && choice>0);
        
    }
   
}
