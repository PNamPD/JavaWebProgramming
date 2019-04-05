/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi9bt;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class StudentManager {
    Student array[] = null;
    public static final int MAX=10;
    private int n=0;
    
    public StudentManager(){
        // khai bao mang array co kieu du lieu Student
        this.array= new Student[MAX];
    }
    
    public void add(){
        
        if(this.n<MAX){
            Student a= new Student();
            a.inputInfo();
            this.array[this.n]=a;
            this.n++;
        } else{
            System.out.println("Danh sach da day");
        }
        
        
    }
    public void show(){
        // bien b kieu student xet tren mang a
        for(int i=0;i<MAX;i++){
            if(this.array[i]==null) continue;
            System.out.println(this.array[i]);
        }
    }
    public void top(){
        double te,max=0;
        int flag[] = new int[10];
        int ca=0;
        Student a[]= new Student[MAX];
        a=array;
        for(int i=0;i<MAX;i++){
            
            for(int j=i+1;j<MAX;j++){
                if((this.array[j])==null) continue;
                if(this.array[i].getMark()>this.array[j].getMark()){
                   
                    Student temp;
                    temp= this.array[i];
                    this.array[i]=this.array[j];
                    this.array[j]=temp;
                    
                }
            }
        }
        for(int i=this.array.length-1;i>=0;i--){
            if((this.array[i])==null) continue;
            System.out.println(" Ten: "+this.array[i].getName()+" va diem: "+this.array[i].getMark());
            ca++;
            if(ca>2){
                break;
            }
        }
        
/*        if(ca<3){
            for(int i=0;i<MAX;i++){
                // cai nay cho vao de no k xet truong hop null
                // neu gap null se bi loi
                if(this.array[i]==null) continue;
                if(this.array[i].getMark()>max ){
                    max= this.array[i].getMark();
                    flag[ca]=i;
                }   
            }
            max=0;
            ca++;
        }
        for(int i=0;i<3;i++){
            System.out.println(" "+flag[i]);
                System.out.println(" "+this.array[flag[i]].getName()+" va diem "+this.array[flag[i]].getMark());
            
        }*/
    }
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
