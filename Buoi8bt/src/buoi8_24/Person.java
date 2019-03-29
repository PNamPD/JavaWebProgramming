/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi8_24;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Person {
    private int id;
    private String name;
    public int getID(){
        return this.id;
    }
    public void setID(int id){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    
    }
    public Person(){
        
    }
    public Person(int id, String name){
        this.id=id;
        this.name=name;
    }
    Scanner in= new Scanner(System.in);
    public void input(){
        System.out.println("Nhap vao id= ");
        this.id= in.nextInt();
        in.nextLine();
        System.out.println("Nhap vao ten= ");
        this.name=in.nextLine();
    }
    
    
}
