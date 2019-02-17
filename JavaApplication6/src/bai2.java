

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
// tinh giai thua no nguyen n
public class bai2 {
    public static void main(String[] args){
        int n;
        System.out.print("Nhap vao n= ");
        Scanner jv= new Scanner(System.in);
        n=jv.nextInt();
        // tinh theo kieu de quy
        
        System.out.println("Giai thua cua so "+n+" la "+GiaiThua(n));
        int giaithua=1;
        while(n>0){
            giaithua= giaithua*n;
            n--;
        }
        System.out.println("Giai thua cua so "+n+" la "+giaithua);

                
    }
    public static int GiaiThua(int n){
        if(n<1){
            return 1;
        }
        return n*GiaiThua(n-1);
    }
}
