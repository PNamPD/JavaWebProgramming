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
public class bai2 {
    public static void DocChuSo(int a){
        
        if(a==0){
            System.out.print("Khong ");
        }
        else if(a==1){
            System.out.print("Mot ");
        }
        else if(a==2){
            System.out.print("Hai ");
        }
        else if(a==3){
            System.out.print("Ba ");
        }
        else if(a==4){
            System.out.print("Bon ");
        }
        else if(a==5){
            System.out.print("Nam ");
        }
        else if(a==6){
            System.out.print("Sau ");
        }
        else if(a==7){
            System.out.print("Bay ");
        }
        else if(a==8){
            System.out.print("Tam ");
        }
        else if(a==9){
            System.out.print("Chin");
        }
        
    }
    public static int Dem(int a) {
        int  dem=0;
        int a1=a;
        while(a1!=0){
            a1/=10;
            dem++;
        }
        return dem;
    }
    
    public static void doc(int a) {
        int daoNguoc=0;
        int a1=a;
        // in ra so dao nguoc
        while(a1!=0){
            daoNguoc = daoNguoc*10 + a1%10;
            a1/=10;
        }
        
        // neu SoLuong == kiemTra +1 va daoNguoc==0 
        int k=daoNguoc%10;
        int SoLuong=Dem(a),sl=SoLuong,kiemTra=0;
        while(daoNguoc!=0){
            
            DocChuSo(k);
            if(SoLuong==4){
                System.out.print(" Triệu ");
            }
            else if(SoLuong==3){
                System.out.print(" Trăm ");
            }
            else if(SoLuong==2){
                System.out.print(" Chuc ");
            }
            else if(SoLuong==1){
                System.out.print(" Nghìn ");
            }
            SoLuong--;
            daoNguoc/=10;
            kiemTra++;
            k=daoNguoc%10;
            if(SoLuong==2 && k==1){
                System.out.print(" Mười ");
                SoLuong--;
                daoNguoc/=10;
                kiemTra++;
            }
            if(kiemTra+1==sl && daoNguoc==0){
                System.out.print(" Nghìn ");
            }
        } 
    }
    public static void main(String[] args){
        Scanner bc= new Scanner(System.in);
        int soTien;
        System.out.print("Nhap so tien vao: ");
        soTien=bc.nextInt();
        doc(soTien);
        
    }
}
