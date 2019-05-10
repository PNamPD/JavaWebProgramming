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
public class Product {
    private String name; // ten
    private String Description; // giao dien
    private double Price; // gia ca
    private int rate; // danh gia
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDescription(){
        return this.Description;
    }
    public void setDescription(String description){
        this.Description=description;
    }
    public double getPrice(){
        return this.Price;
    }
    public void setPrice(double Price){
        this.Price = Price;
    }
    public int getRate(){
        return this.rate;
    }
    public void setRate(int rate){
        this.rate=rate;
    }
    public Product(){
        
    }
    public Product(String name, String Description, double price, int rate){
        this.Description= Description;
        this.name=name;
        this.Price= price;
        this.rate= rate;
    }
    boolean check;
    public void infoInfo(){
        Scanner in= new Scanner(System.in);
        
            System.out.println("Ten san pham: ");
            this.name=in.nextLine();
            System.out.println("Giao dien nguoi dung: ");
            this.Description=in.nextLine();
            do{
               
               check = true;
               try{
               System.out.println("Gia san pham: ");
               this.Price=in.nextDouble();
               }catch(Exception e){
                   System.out.println("Loi chuong trinh!");
                   check=false;
               }
               if (check==true){
                   if(this.Price<0 || this.Price>100){
                       System.out.println("Nhap lai gia tu 0 den 100!");
                       check=false;
                   }
               }
               in.nextLine();
            }while(check==false);    
            do{
                check=true;
                try{
                    System.out.println("Danh gia san pham: Chon tu 1 den 5");
                    this.rate=in.nextInt();
                    
                }catch(Exception e1){
                    System.out.println("Loi chuong trinh");
                    check=false;
                }
                if(check){
                    if(this.rate<0 || this.rate>5){
                        System.out.println("Vui long danh gia lai!");
                        check=false;
                    }
                }
                in.nextLine();
            }while(!check);
        }
    @Override
    public String toString(){
            
            return "Ten: "+this.name+" gia "+this.Price+" Giao dien: "
                    +this.Description+" danh gia "+this.rate;
            
        }
        
    
    
}
