/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_15;

/**
 *
 * @author ASUS
 */
public class Battery {
    private int energy;
    
    public int getEnergy(){
        return this.energy;
    }
    public void setEnergy(int energy){
        this.energy=energy;
    }
    public Battery(){
        this.energy=10;
    }
    // trang thai nang luong
    // translate giam bot nang luong
    public void decreaseEnergy(int use){
        this.energy-=(2*use);
        System.out.println("Nang luong pin:  "+this.energy);
    }
    
}
