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
public class SmartPhone extends Product{
    private boolean hasCamera;
    private int sim; 

    
    public void addNew(){
        // goi ham toi mang cha la Product
        super.addNew();
        Scanner sc= new Scanner(System.in);
        int choice;
        System.out.println("Co camera khong? chon 1 hoac 0");
        choice= sc.nextInt();
        if(choice == 1){
            this.hasCamera=true;
        }
        else this.hasCamera=false;
        System.out.println("Nhap vao so dien thoai: ");
        this.sim=sc.nextInt(); 
        sc.nextLine();
    }
    @Override
    public String toString(){
        return super.toString()+", hasCamera= " +hasCamera+ " hasSim "+sim;
    }
    // khai bao constructor tham so
    public SmartPhone(){
        super();
    }
    // khai bao constructor co tham so
    public SmartPhone(boolean hasCamera, int sim, int id,String name,double price,int quantity){
        super(id,name,price,quantity);
        this.hasCamera= hasCamera;
        this.sim=sim;
    }
    public boolean isHasCamera(){
        return true;
    }
    public void setHasCamera(boolean hasCamera){
        this.hasCamera = hasCamera;
    }
    public int getsim(){
        return this.sim;
    }
    public void setSim(int sim){
        this.sim=sim;
    }
    
}
