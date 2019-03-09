/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

/**
 *
 * @author ASUS
 */
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] m1Values = {{1,2,3},
                             {4,5,6},
                             {7,8,9}};
        int [][] m2Values = {{3,1,5},
                             {2,1,4},
                             {2,2,2}};
        Matrix m1= new Matrix(3,3,m1Values);
        Matrix m2= new Matrix(3,3,m2Values);
        boolean isDx= m1.checkDX();
        m1.print();
        boolean areDx= m2.checkDX();
        m2.print();
        if(isDx==true){
            System.out.println("Ma tra doi xung");
        }
        else System.out.println("Ma tran ko doi xung");
        if(areDx) System.out.println("2");
         else System.out.println("Ma tran ko doi xung");
    }
}
