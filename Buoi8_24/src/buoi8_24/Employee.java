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
public class Employee extends Person{
    private double salary;
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary= salary;
    }
    @Override
    public void input(){
        super.input();
        System.out.println("Nhap luong: ");
        this.salary= in.nextDouble();
    }
}
