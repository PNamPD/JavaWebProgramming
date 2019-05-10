/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi10;

/**
 *
 * @author ASUS
 */
public class Student {
    private String name,email;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Student(){
        
    }
    public void Student(String name,String email, int age){
        this.age=age;
        this.email=email;
        this.name=name;
    }
}

