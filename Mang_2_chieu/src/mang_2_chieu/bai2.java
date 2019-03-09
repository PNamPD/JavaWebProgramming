/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang_2_chieu;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class bai2 {
    public static void main(String[] args){
        Scanner bc = new Scanner(System.in);
        int Matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int maTran[][] = {{11,12,13},{14,15,16},{17,18,19}};
        int maTranTong[][]= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                maTranTong[i][j]= Matrix[i][j]+ maTran[i][j];
            }
        }
        System.out.println("TOng 2 ma tran : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+maTranTong[i][j]);
            }
            System.out.println("");
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                maTranTong[i][j]= Matrix[i][j]* maTran[i][j];
            }
        }
        System.out.println("Tich 2 ma tran : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+maTranTong[i][j]);
            }
            System.out.println("");
        }
        // tinh dinh thuc trong ma tran
        double dinhThuc;
       dinhThuc= (Math.pow(-1, 1)*Matrix[0][0])*(((Matrix[1][1])*Matrix[2][2])-(Matrix[1][2]*Matrix[2][1]));
       System.out.print(" "+dinhThuc);
    }
}
