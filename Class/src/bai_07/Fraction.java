/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_07;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Fraction {
    // tu so
    private int numerator;
    // mau so
    private int denominator;
    private int test;
    private int tuSo;
    private int mauSo;
    public void setTuSo(int tuSo){
        this.tuSo=tuSo;
    }
    public int getTuSo(int tuSo){
        return this.tuSo;
    }
    public void setmauSo(int mauSo){
        this.mauSo=mauSo;
    }
    public int getmauSo(int mauSo){
        return this.mauSo;
    }
    public void setTest(int test){
        this.test=test;
    }
    public int test(){
        return this.test;
    }
    public void setnumerator(int numeretor){
        this.numerator=numeretor;
    }
    public  int getnumerator(){
        return this.numerator;
    }
    
   public void setdenominator(int denominator){
       this.denominator=denominator;
   }
   public int getdenominator(){
       return this.denominator;
   }
   Scanner in= new Scanner(System.in);
   public void inputInfo(){
       System.out.println("Nhap vao tu so: ");
       this.numerator=in.nextInt();
       System.out.println("Nhap vao mau so: ");
       this.denominator=in.nextInt();
       System.out.println("Nhap vao tu so: ");
       this.tuSo=in.nextInt();
       System.out.println("Nhap vao mau so: ");
       this.mauSo=in.nextInt();
   }
   public void printInfo(){
       System.out.println("tuso/mauso: "+this.numerator+"/"+this.denominator+"");
       System.out.println("tuso/mauso: "+this.tuSo+"/"+this.mauSo+"");
   }
   public int UCLN(int a,int b){
       for(int i=a;i>=1;i--){
           if(a%i==0 && b%i==0){
               test=i;
               break;
           }
       }
       return test;
    }
    public void rutGon(){
       int c= UCLN(this.numerator,this.denominator);
       this.denominator=this.denominator/c;
       this.numerator=this.numerator/c;
       System.out.println("tuso/mauso: "+this.numerator+"/"+this.denominator+"");
       // nghich dao ma tran
       int k; 
       k=this.numerator;
       this.numerator=this.denominator;
       this.denominator=k;
       System.out.println("Nghich dao ma tran: tuso/mauso: "+this.numerator+"/"+this.denominator+"");
   }
    public int BCNN(int a,int b){
        int bcnn;
        if(a%b==0){
            return a;
        }else{
            for(int i=a+1;;i++){
                if(i%a==0 && i%b==0){
                    bcnn=i;
                    break;
                }
            }
        }
        return bcnn;
    }

    // cong 2 phan so
   public void add(){
       int a;
       System.out.println("---------");
       System.out.println("numerator/denominator : "+this.numerator+"/"+this.denominator+"");
       System.out.println("tuso/mauso 11: "+this.tuSo+"/"+this.mauSo+"");
       int c=BCNN(this.denominator,this.mauSo);
       System.out.println(" + "+c);
       
       a=((c/this.mauSo)*this.tuSo)+((c/this.denominator)*this.numerator);
       System.out.println("+ "+a);
       System.out.println("cong "+a+"/"+c);
   }
   // tru 2 phan so
   public void sub(){
       int a;
       int c=BCNN(this.denominator,this.mauSo);
        a=((c/this.mauSo)*this.tuSo)-((c/this.denominator)*this.numerator);
   
       System.out.println("tru: "+a+"/"+c);
   }
   public void mul(){
       this.numerator*=this.tuSo;
       this.denominator*=this.mauSo;
       System.out.println("nhan: "+this.numerator+"/"+this.denominator);
   }
   public void div(){
       this.numerator*=this.mauSo;
       this.denominator*=this.tuSo;
       System.out.println("chia: "+this.numerator+"/"+this.denominator);
   }
}
