/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_3_2019;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Camera extends Product{
    public boolean hasWifi;
    public Camera(){
        super();
    }
    public  Camera(int id, String name,double gia, int soLuong,boolean hasWifi){
        super(id,name,gia,soLuong);
        this.hasWifi=hasWifi;
        
    }
    public boolean ishasWifi(){
        return true;
    }
    public void sethasWifi(boolean hasWifi){
        this.hasWifi=hasWifi;
    }
    @Override
    public void addNew(){
        // goi ham toi mang cha la Product
        super.addNew();
        int choice;
        System.out.println("May co wifi khong, chon 1/0?");
        choice=in.nextInt();
        if(choice == 1){
            this.hasWifi=true;
        }
        else {
            this.hasWifi=false;
        }
    }
    
    
    
    
    
}
