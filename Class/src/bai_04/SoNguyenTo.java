/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_04;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SoNguyenTo {
    private int primeNumber;
    public void SoNguyenTo(){
        
    }
    Scanner in= new Scanner(System.in);
    
    
    public void setprimeNumber(int primeNumber){
        
        this.primeNumber=primeNumber;
    }
    public int getprimeNumber(){
        return primeNumber;
    }
    public boolean isSoNguyenTo(int x){
        if(this.primeNumber<0){
            return false;
        }
        else if(this.primeNumber==2 || this.primeNumber==3){
            return true;
        }
        else {
            for(int i=2;i<=(Math.sqrt(this.primeNumber));i++){
                if(this.primeNumber%i==0){
                    return false;
                    
                }
            }
            return true;
        }
    }
    public void soNguyenTo(int x){
        boolean test;
        test= isSoNguyenTo(x);
        if(test==true){
            this.primeNumber=x;
            System.out.println("Day la so nguyen to1");
        }
        else System.out.println(x+" khong phai so nguyen to"); 
    }
    public int timSoNguyenToTiepTheo(int x){
        int a=x+1;
        while(a>0){
            if(isSoNguyenTo(a)==false){
                a++;
            }
            else 
             break;
        }
        return a;
    }
    
    
}
