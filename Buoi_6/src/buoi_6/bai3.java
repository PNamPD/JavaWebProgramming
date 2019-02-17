/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_6;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
// doi tien 3.000.000 thanh cac to tien khac nhau
public class bai3 {
    public static void main(String[] args){
        int sotien;
        System.out.print("Nhap vao so tien can doi: ");
        Scanner bc = new Scanner(System.in);
        sotien = bc.nextInt();
        int dem500=0,dem200=0,dem100=0,du;
        
        while(sotien!=0){
            dem500=sotien/500000;
            sotien=sotien-(dem500*500000);
            dem200=sotien/200000;
            sotien=sotien-(dem200*200000);    
            dem100=sotien/100000;
            sotien=sotien-(dem100*100000);
            
        }
       System.out.print("So tien ia ra duoc ");
       if(dem500>0){
           System.out.print(""+dem500+" so to 500k ");
       }
       else System.out.print("");
       
       if(dem200>0){
           System.out.print(""+dem200+" so to 200k ");
       }
       else System.out.print("");
       if(dem100>0){
           System.out.print(""+dem100+" so to 100k ");
       }
       else System.out.print("");
//      System.out.println();
//       System.out.print("So tien in ra "+dem500+" to 500k "+dem200+" to 200k "+dem100+" to 100k");
    }
}
