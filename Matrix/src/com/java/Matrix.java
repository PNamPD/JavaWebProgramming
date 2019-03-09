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
public class Matrix {
    //thuoc tinh col co quyen truy nhap private trong java
    private int col;
    // khai bao bien row co quyen truy nhap private trong java
    private int row;
    // khai bao mang nguyen values truy nhap private(han che truy cap )
    private int[][] values;
    // khai bao public() ham trung voi class
    // thuoc tinh khai bao- 
    public Matrix(){
        // khai bao this. cor = 3;
        //
        this.col = 3;
        this.row = 3;
        this.values = new int[3][3];
    }
    // truyen vao tham so o tren thuoc tinh
    // no bang cai gi
    // phuong thuc la ham the hien hanh vi cua 1 doi tuong
    //
    public Matrix(int col, int row, int[][] values){
        
        this.row=col;
        this.row= row;
        this.values=values;
    }
    
    // kieu tra ve la phuong thuc
    // get la lay ra
    public int getCol(){
        return this.col;
    }
    // set la them vao
    // them vao setCol (dua bien vao trong)
    public void setCol(int col){
        this.col=col;
    } 
    // kieu tra ve phuong thuc <hanh dong cua 1 bien>
    public int getRow(){
        return this.row;
    }
    public void setRow(int row){
        this.row=row;
    }
    
    public int[][] getValues(){
        return values;
    }
    public void setValues(int [][] values){
        this.values=values;
    }
    public Matrix add(Matrix m){
        // kiem tra kich thuoc
        Matrix result = new Matrix(this.col,this.row,this.values);
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
                result.values[i][j]=m.values[i][j] + this.values[i][i];
            }
        }
        return result;
    }
    public boolean checkDX(){
    boolean flag= true;
    for(int i=0;i< this.row;i++){
        for(int j=0;j<this.col;j++){
            if(this.values[i][j] != this.values[j][i]){
                flag= false;
                break;
            }
        }
    }
    return flag;
}
    public void print(){
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
                System.out.print(this.values[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
