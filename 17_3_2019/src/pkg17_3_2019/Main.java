/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_3_2019;

import java.util.Scanner;
import java.awt.Choice;
/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Choice 1: Add Product ");
        System.out.print("Choice 2: List Product ");
        System.out.print("Choice 3: Search ");
        System.out.print("Choice 4: Exit ");
        System.out.println("Moi ban chon: ");
        int choice;
        choice= in.nextInt();
        Store st= new Store();
        do{
            switch(choice){
            case 1: 
                st.addProduct();
                break;
            case 2:
                st.listProduct();
                break;
            case 3:
                System.out.println("Nhap ten mat hang can dung: ");
                String name= in.nextLine();
                st.search(name);
                break;
            case 4: break;    
            }
            in.nextLine();
            if(choice!=4){
                System.out.println("Ban muon thuc hien tiep ko?");
            }
        }while(choice!=4);
        
    }
    
}
