/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_13;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class point {
    private int a;

   
    public int getA(){
        return this.a;
    }
    public void setA(int a){
        this.a=a;
    }
   
    
    public point(){
        
    }
    public void Info(){
        Scanner in= new Scanner(System.in);
        System.out.println("Nhap vao toa do diem a: ");
        this.a= in.nextInt();
       
    }

    @Override
    public String toString() {
        return "point{" + "a=(" + a +",0)";
    }
    
}            
