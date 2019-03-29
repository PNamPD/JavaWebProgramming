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
public class elip extends point{
    private int c;
    private point a,b;
    public int getC(){
        return this.c;
    }
    public void setC(int c){
        this.c=c;
    }
    @Override
    public void Info(){
        Scanner in= new Scanner(System.in);
        super.Info();
        do{
            System.out.println("Nhap vao ban hinh hinh elip: ");
            System.out.println("Ban kinh lon hon "+(this.getA()));
            this.c=in.nextInt();
            if(this.c>(this.getA())){
                System.out.println("Vui long nhap lai!");
            }
        }while(this.c>(this.getA())); 
    }
    
    
}
