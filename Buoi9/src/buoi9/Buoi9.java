/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi9;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Buoi9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Input a = new Input();
        Input b= new Input();
        int a1= a.inputNumber();
        int b1= b.inputNumber();
        System.out.println("Chia : "+a1/b1);      
    }
    
}
