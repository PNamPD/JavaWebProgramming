/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

/**
 *
 * @author ASUS
 */
public class Bai12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hinhBinhHanh a= new hinhBinhHanh();
        a.hinhBinhHanh(3, 4, 3, 4);
        if(a.testHinhBinhHanh()==true){
            System.out.println("Day la hinh hinh hanh");
        }
        else System.out.println("ko phai!");
        
    }
    
}
