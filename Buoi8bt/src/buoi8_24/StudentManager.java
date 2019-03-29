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
class StudentManager extends Manager{
    protected Student a[];
    protected int n;
    public static final int max=20;
    Scanner in= new Scanner(System.in);
    public StudentManager(){
        a = new Student[max];
    }
    @Override
    public void add() {
//         for(int i=0;i<max;i++){
//             a[i].input();
//         }
        Student s= new Student();
        s.input();
        a[n]=s;
        n++;
    }

    @Override
    public void show() {
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    @Override
    public void search(String name) {
        boolean test = false;
        for(int i=0;i<max;i++){
            test= a[i].getName().equals(name);
        }
        if(test == true){
            System.out.println("YES!");
        }
        else {
            System.out.println("NO!");
        }
        
    }
    
}
