/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Shop {
    // khai bao 1 mang product
    private Product ArrayList[];
    private int n;

    public Product[] getArrayList() {
        return ArrayList;
    }

    public void setArrayList(Product[] ArrayList) {
        this.ArrayList = ArrayList;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public Shop(Product ArrayList){
        this.ArrayList= new Product[20];
    }
    public void addProduct(){
        Product a= new Product();
        a.infoInfo();
        ArrayList[n]= a;
        n++;
    }
    public void viewProduct(){
        for(int i=0;i<ArrayList.length;i++){
            System.out.println(ArrayList[i]);
        }
    }
    public void remoteProduct(){
        String remote;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap vao ten san pham: ");
        remote= in.nextLine();
        for(int i=0;i<ArrayList.length;i++){
            ArrayList.equals(remote);
        }
    }
}
