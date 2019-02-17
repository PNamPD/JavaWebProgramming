
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
// tinh phuong trinh bac 2 ax2+bx+x
public class bai1 {
    public static void main(String[] args){
        float a,b,c;
        Scanner jv = new Scanner(System.in);
        System.out.println("Nhap a= ");
        a= jv.nextFloat();
        System.out.println("Nhap b= ");
        b= jv.nextFloat();
        System.out.println("Nhap c= ");
        c= jv.nextFloat();
        if(a==0 && b==0){
            System.out.println("Phuong trinh vo nghiem");
        }
        float ketQua1;
        float ketQua2;
        float delta;
        delta=b*b-4*a*c;
        if(delta<0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else if(delta == 0){
            ketQua1=-b/(2*a);
            System.out.println("Phuong trinh co 1 nghien x= "+ketQua1);
        }
        else{
            // sqrt nhan double, goi ham math.sqrt 
            // ep kieu sang float nhu duoi
            
            float del = (float) Math.sqrt(delta);
            ketQua1=-b+del/(2*a);
            ketQua2=-b-del/(2*a);
            System.out.println("Phuong trinh co 2 nghiem x1= "+ketQua1+" va x2= "+ketQua2+"");
        }
        
    }  
}
