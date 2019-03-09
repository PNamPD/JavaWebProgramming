
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
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NhanVien b = new NhanVien() ;
       // khoi tao mang co kieu du lieu la nhan vien
       
       // khoi tao tung phan tu trong mang
//       b.inputInfo();
       
//       a[0] = new NhanVien();
       
       int n;
        System.out.print("Nhap vao so nhan vien=  ");
        Scanner bc= new Scanner(System.in);
     
        n = Integer.parseInt(bc.nextLine());
        NhanVien a[]= new NhanVien [n];
        
        for(int i=0;i<n;i++){
           // mang a[i]=  kkhoi tao kieu du lieu nhan vien
            System.out.println("Nhap vao nhan vien thu "+(i+1));
            NhanVien c= new NhanVien();
            c.inputInfo();
            a[i]=c;
        }
        for(int i=0;i<n;i++){
            System.out.println("----------");
            a[i].printInfo();
            a[i].tinhLuong();
            System.out.println();
        }
    }
}
