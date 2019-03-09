/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Matrix {
    // 
    private int[] values;
    private int n;
    Scanner in= new Scanner(System.in);
    // contructor
    public Matrix(){
       this.n=5; // bang 5 phan tu
       // goi lai class, khai bao mang 5 phan tu
       this.values= new int[5];
    }
    // (method cua class
    public Matrix(int n, int[] values){
        this.n=n;
        this.values= values;
    }
    
    // tiep theo la gi
    // goi lai cac bien o trong class
    // getter-  setter

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }
    public int getn(){
        return n;
    }
    public void setn(int n){
        this.n = n;
    }
    public void Xuat(int[] values, n){
        for(int i=0;i<this.n;i++){
            System.out.println(" "+this.values[i]);
        }
    }
}
