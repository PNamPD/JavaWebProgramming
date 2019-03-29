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
public class FlashLamp {
    private boolean status;
    private Battery batterry;
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status=status;
    }
    // lay ra nang luong cho den
    public Battery getBattery(){
        return this.batterry;
    }
    // nap pin cho den
    public void setBattery(Battery b){
        this.batterry=b;
    }
    public FlashLamp(){
        this.status=false;
        
    }
    public void turnOn(){
        Battery a = new Battery();
        
        a.getEnergy();
        if((this.status==true) && (a.getEnergy()>0)){
            System.out.println("ON");
        } 
    }
    public void turnOff(){
        System.out.println("OFFFFFFFFFFF");
    }
    
    
}
