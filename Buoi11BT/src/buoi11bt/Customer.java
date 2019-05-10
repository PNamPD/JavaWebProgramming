/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi11bt;
import java.io.Serializable;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Customer implements Serializable{
    private int id;
    private String name;
    private String address;
    private int age;
    Scanner sc = new Scanner(System.in);
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id= id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + '}';
    }
    public void Info(){
        System.out.print("Nhap vao id: ");
        this.id= sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap vao ten: ");
        this.name=sc.nextLine();
        System.out.print("Nhap vao dia chi: ");
        this.address= sc.nextLine();
        System.out.print("Nhaap vao tuoi: ");
        this.age= sc.nextInt();
    }
    
}
