/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class bai5 {
    // tinh tong so nguyen dang S= 1+1/2+1/3+ 1/n
    public static float Test1(int k){
        float tong=0;
        while( k>0){
            tong+=(1/(float)(k));
            k--;
        }
        return tong;
    }
    
    
    public static void main(String[] args){
        int n;
        Scanner jv= new Scanner(System.in);
        System.out.print("Nhap vao so n= ");
        n=jv.nextInt();
        System.out.print("Gia tri cua bai 5 dong 1 la : "+Test1(n));
    }
}
