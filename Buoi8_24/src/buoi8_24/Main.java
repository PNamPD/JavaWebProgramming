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
public class Main {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String test;
        System.out.println("Student or Employee (S/E)");
        test= in.nextLine();
        Manager demo = null;
        // to UpperCase cho cac chu thanh chu hoa
        if(test.toUpperCase().equals("S")){
            demo= new EmployeeManager();
            
        }
        else if(test.toUpperCase().equals("E")){
            demo= new StudentManager();
        }
        else System.out.println("False");
        
        if(demo!=null){
            Menu a= new Menu(demo);
            a.display();
        }
        
        
        
    }
}
