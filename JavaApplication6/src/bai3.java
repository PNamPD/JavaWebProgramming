
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
// kiem tra xem a co phai so nguyen to khong
// in ra n so nguyen to voi n nhpa tu ban phim
public class bai3 {
    public static boolean KtSoNguyenTo(int k){
 //       int flag=1;
        if(k<=1){
            return false;
        }
        else if(k==2 || k==3){
            return true;
        }
        else{
            for(int i=2;i<= (int) Math.sqrt(k);i++){
                if(k%i==0){
                    return false;
              //      break;
                }
            }
            return true;
        }
      
    }
    public static void main(String[] args){
        int k;
        System.out.print("Nhap vao gia tri can kiem tra: ");
        Scanner jv= new Scanner(System.in);
        k=jv.nextInt();
        if(KtSoNguyenTo(k)==true){
            System.out.println("Day la so nguyen to");
        }
        else System.out.println("Khong phai so nguyen to");
        int n,dem=0;
        int sokt=1;
        System.out.println("Ban muon in ra bao nhieu so nguyen so");
        System.out.print("\tNhap vao : ");
        n= jv.nextInt();
        System.out.println("Cac so nguyen to la: ");
        while(dem<=n){
            if(KtSoNguyenTo(sokt)==true){
                System.out.print(" "+sokt);
                dem++;
            }
            sokt++;
        }
        
    }
}
