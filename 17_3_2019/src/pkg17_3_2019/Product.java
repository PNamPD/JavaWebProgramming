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
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    public Product(){
        
    } 
    public Product(int id,String name,double price, int quantity){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    Scanner in= new Scanner(System.in);
    
    public void addNew(){
        System.out.println("Nhap vao ma id: ");
        this.id=in.nextInt();
        in.nextLine();
        System.out.println("Nhap vao ten san pham: ");
        this.name=in.nextLine();
        System.out.println("Nhap vao gia thanh: ");
        this.price=in.nextDouble();
        System.out.println("Nhap vao so luong san pham: ");
        this.quantity=in.nextInt(); 
        in.nextLine();
    }
    @Override
    public String toString(){
        return "Product +name"+name+" id "+id+" gia"+price+" so luong "+quantity+"}";
    }
    
}
