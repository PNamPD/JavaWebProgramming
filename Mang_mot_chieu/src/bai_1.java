
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
public class bai_1 {
    // nhap vao mang so nguyen 5 phan tu
    // tinh tong cac phan tu trong mang
    // tinh tong cac phan tu le
    // tinh tong cac phan tu chan
    public static void main(String[] args) {
        Scanner bc= new Scanner(System.in);
         int[] mang = new int[5];
         int tong=0;
         System.out.println("Nhap vao kieu du lieu!");
         for(int i=0;i<5;i++){
             System.out.print("Nhap vao so nguyen: ");
             mang[i] = bc.nextInt();
             tong=tong+mang[i];
         }
         System.out.println("Tong cac so vua nhap: "+tong);
         tong=0;
         for(int i=0;i<5;i++){
            if(mang[i]%2!=0){
                tong=tong+mang[i];
            }
         }
         System.out.println("Tong cac so leeeee : "+tong);
         tong=0;
         for(int i=0;i<5;i++){
            if(mang[i]%2==0){
                tong=tong+mang[i];
            }
         }
         System.out.println("Tong cac so channnnn: "+tong);
    }
}
