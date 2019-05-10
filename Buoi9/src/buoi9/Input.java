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
public class Input {
    
    public int inputNumber(){
        Scanner in = new Scanner(System.in);
        int a=0;
        boolean flag;
        do{
            flag =true;
            try{
                System.out.println("Nhap so: ");
                a= Integer.parseInt(in.nextLine());
            } catch(Exception e){
                System.out.println("Khong dung tinh dang");
                flag=false;
            }
        }while(!flag); // flag==false
        return a;
    }
}
