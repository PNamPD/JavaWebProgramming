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
class EmployeeManager extends Manager{
    protected Employee a[] = null;
    Scanner in= new Scanner(System.in);
    public static final int MAX=20;
    protected int n=0;
    // khoi tao Empoyeemanager co gia tri max
    public EmployeeManager(){
        this.a= new Employee[MAX];
    }
    @Override
    public void add() {
//        for(int i=0;i<MAX;i++){
//            a[i].input();
//        }
        Employee test= new Employee();
        test.input();
        a[n]=test;
        n++;
        
    }

    @Override
    public void show() {
        
        for(int i=0;i<a.length;i++){
            System.out.println(" "+a[i]);
    }
        }

    @Override
    public void search(String name) {
        boolean test=false;
        for(int i=0;i<MAX;i++){
            test=a[i].getName().equals(name);
        }
        if(test==true){
            System.out.println("YES");
        }
        else System.out.println("FALSE");
    }
    
    
}
