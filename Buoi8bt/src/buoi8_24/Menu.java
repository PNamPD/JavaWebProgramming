/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi8_24;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Menu {
    private Manager manager = null;
    public Menu(Manager manager){
        this.manager = manager;
    }

    public void display(){
        Scanner sc= new Scanner(System.in);
        int choice;
        do{
            System.out.println("1.Them vao: ");
            System.out.println("2.In ra");
            System.out.println("3.Tim kiem");
            System.out.println("4.Thoat");
            System.out.println("Moi ban chon");
            choice = sc.nextInt();
            switch(choice){
                case 1: {
                    manager.add();
                    break;
                }
                case 2: {
                    manager.show();
                    break;
                }
                case 3: {
                    
                    System.out.println("Nhap vao tu can tim: ");
                    String name = new String();
                    manager.search(name);
                    break;
                }
                
            }
            System.out.println("Ban muon tiep tuc khong?");
            
        }while(choice>0 && choice<4);
        
    }
        
    
}
