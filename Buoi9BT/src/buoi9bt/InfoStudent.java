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
public class InfoStudent {
    
    public Scanner in;
    
    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }
    
    public InfoStudent(){
        
    }
    public String inputId(){
        String id;
        do{
            System.out.println("Nhap vao id: ");
            id= in.nextLine();
            
        }while(true);
    }
    
}
