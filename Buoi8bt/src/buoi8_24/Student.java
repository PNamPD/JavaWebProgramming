/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi8_24;

/**
 *
 * @author ASUS
 */
public class Student extends Person{
    String mail;
    public String getMail(){
        return this.mail;
    }
    public void setMail(String mail){
        this.mail=mail;
    }
    public Student(){
        
    }
    public Student(int id,String anem){
        
    }
    @Override
    public void input(){
        super.input();
        System.out.println("Nhap mail: ");
        in.nextLine();
    }
}
