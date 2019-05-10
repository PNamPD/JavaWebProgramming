/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_3_2019;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Store extends Product{
    // tao mang products co kei du lieu la Product
    private Product[] products;
    int number =0;
    public static final int MAX=20;
    public void addProduct(){
        // khai bao 1 bien p kieu Product
        Product p ;
        // chon camera hoac smartphone
        int choice;
        do{
            System.out.println("Chon smartphone hoac camera 1/0: ");
            choice= in.nextInt();
            if(choice<0 || choice>1){
                System.out.println("Xin moi chon lai!");
            }
        }while(choice<0 || choice>1);
        if(choice==1){
            p = new SmartPhone();
        }
        else {
            p = new Camera();
        }
        System.out.println(" p= "+products[0]);
        p.addNew();
        System.out.println(" p= "+products[0]);
        System.out.println(" "+number+" "+MAX);
        if(number<MAX){
            products[number] = p;
            number++;            
        }
        else{
            System.out.println("Khong xac nhan them phan tu nua!");
            return;
        }
        
    }
    public void listProduct(){
        System.out.println("====DANH SACH====");
        
        System.out.print( "Ten san pham: "+this.getName()+" gia thanh: "+this.getPrice()+"!");
        System.out.println("So luong: "+this.getQuantity()+" id "+this.getId());
    }
    public void search(String name){
        boolean test;
        test= this.getName().equals(name);
        if(test==true){
            System.out.println("Co san pham dang ban!");
        }
        else System.out.println("K co!");
    }
    // khai bao kei constructor bien store
    public Product[] getProducts(){
        return this.products;
    }
    public void setProducts(Product[] products){
        this.products= products;
    }
    // 
    public int getNumber(){
        return this.number;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public Store(Product[] products){
        // khai bao ten bien products co kieu du lieu Product 
        this.products = products;
        this.number = 1;
    }
    public Store(){
        
    }
    
}
