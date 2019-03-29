/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_15;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TestFlashLamp {
    public static void main(String[] args){
        Battery a= new Battery();
        FlashLamp b = new FlashLamp();
        Scanner in = new Scanner(System.in);
        int choice;
        // in ra trang thai pin
        a.getEnergy();
        System.out.println("Nang luong hien tai cua pin: "+a.getEnergy());
        // bat den
        boolean test= true;
        b.setStatus(test);
        // tat bat den 10 lan
        System.out.println("Nhap vao so lan tat bat den: ");
        choice= in.nextInt();
        for(int i=0;i<choice;i++){
            if(i%2==0){
                b.turnOn();
            }
            else b.turnOff();
        }
        a.decreaseEnergy(choice/2);
        System.out.println("Nang luong hien tai cua pin: "+a.getEnergy());
    }
}
