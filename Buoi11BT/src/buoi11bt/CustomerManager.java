/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi11bt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class CustomerManager {
    private String dir= "cust.dat";
    private int i=0;
//    Customer[] cus = new Customer[20];
//    Customer[] cus;
    // khai bao collections list  
    private List<Customer> List;
    //  co the khai bao Arraylist
    //  ArrayList<Customer> list;
    public CustomerManager(){
        this.List =  new ArrayList<>();
    }
    
    public void add(){
/*        if(cus.length>20){
            System.out.println("Mang da d");
        }
        else{
            
            Customer a= new Customer();
            a.Info();
            cus[i]= a;
            i++;
        }*/
        Customer cus= new Customer();
        System.out.print("Id= ");
        cus.setId(i);
        System.out.print("Ten:  ");
        cus.setName(dir);
        System.out.print("Dia chi: ");
        cus.setAddress(dir);
        System.out.print("Tuoi: ");
        cus.setId(i);
        // list add la them vao
        List.add(i, cus);
        i++;
    }
    public Customer search(int id){

        // cos 2 cach
        // dung for chay vong lap
/*        for(Customer i: List){
            if(id==i.getId()){
                return i;
            }
        }
        return null; */
        // 2 la dung 
        
        if(List.contains(id)){
            System.out.println("Co id trong List");
            for(Customer i: List){
            if(id==i.getId()){
                return i;
            }
        }
        
    }
        return null;
   }
    // save duoc  file chua
    public boolean save(){
        return true;
    }
        
}
