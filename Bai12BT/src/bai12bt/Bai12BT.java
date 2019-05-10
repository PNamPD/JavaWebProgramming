/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12bt;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai12BT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentManager sm= new StudentManager();
        int choice;
        String name;
        Scanner sc= new Scanner(System.in);
        try{
            System.out.println("=======MENU=======");
            while(true){
                System.out.println("1.Add");
                System.out.println("2.Search");
                System.out.println("3.Update");
                System.out.println("4.Delate");
                System.out.println("5.Save");
                System.out.println("6.Show");
                System.out.println("7.Exit");
                System.out.print("Nhap lua chon: ");
                choice= sc.nextInt();
                switch(choice){
                    case 1: sm.add();
                    break;
                    case 2:
                        System.out.println("Nhap vao ten can tim: ");
                        sc.nextLine();
                        name= sc.nextLine();
                        if(sm.search(name)){
                            System.out.println("CO trong danh sach");
                        }
                        else System.out.println("Nooo");
                        break;
                    case 3:
                        sm.update();
                        break;
                    case 4:
                        sm.delate();
                        break;
                    case 5: 
                        break;
                        
                }
                if(choice==7){
                    break;
                }
            }
            
            
        }catch(Exception e){
            System.out.println("Co loi xay ra1");
        }
    }
    
}
