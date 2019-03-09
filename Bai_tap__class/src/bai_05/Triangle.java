/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_05;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Triangle {
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
    private int a;
    private int b;
    private int c;
    private int flag;
    private int flag1;
    private int flag2;
    Scanner in= new Scanner(System.in);
    public void geta(int a){
        this.a=a;
    }
    public int seta(){
        return this.a;
    }
    public void getb(int b){
        this.b=b;
    }
    public int setb(){
        return this.b;
    }
    public void getc(int c){
        this.c=c;
    }
    public int setc(){
        return this.c;
    }

        public int getFlag() {
            return flag;
        }

        public void setFlag(int flag) {
            this.flag = flag;
        }

        public int getFlag1() {
            return flag1;
        }

        public void setFlag1(int flag1) {
            this.flag1 = flag1;
        }

        public int getFlag2() {
            return flag2;
        }

        public void setFlag2(int flag2) {
            this.flag2 = flag2;
        }
    
    public void inputInfo(){
        do{
            System.out.println("Nhap vao canh a= ");
            this.a=in.nextInt();
            if(this.a<=0){
                System.out.println("Vui long nhap lai!");
            }
        }while(this.a<=0);
        do{
            System.out.println("Nhap vao canh b= ");
            this.b=in.nextInt();
            if(this.b<=0){
                System.out.println("Vui long nhap lai!");
            }
        }while(this.b<=0);
        do{
            System.out.println("Nhap vao canh c= ");
            this.c=in.nextInt();
            if(this.c<=0){
                System.out.println("Vui long nhap lai!");
            }
        }while(this.c<=0);
    }
    // tam giac vuong
    public boolean rightTriangle(int a, int b, int c){
        int test= b*b + c*c;
        int test1= a*a;
        return test== test1;
    }
    // tam giac deu
    public boolean equilateralTriangle(int a,int b,int c){
        return (a==b && a==c && b==c);
    }
    public boolean isoscelesTriangle(int a,int b,int c){
        return (a==b && a==c);
    }
    public boolean testTamGiac(int a,int b,int c){
        int tong;
        tong=a+b;
        return tong>=c;
    }
    
    public void xacDinh(int a,int b,int c){
/*        int max;
        if(this.a>this.b && this.a>this.c){
            max=this.a;
        }
        else if(this.b>this.c && this.b>this.a){
            max=this.b;
        }
        else max=this.c; */
        
        // test tam giac vuong
            if((rightTriangle(this.a,this.b,this.c)==true)|| (rightTriangle(this.b,this.c,this.a)==true) || (rightTriangle(this.c,this.a,this.b)==true)){
                this.flag=1;
            }
            // test tam giac deu
            else if((equilateralTriangle(this.a,this.b,this.c)==true || equilateralTriangle(this.b,this.c,this.a)==true || equilateralTriangle(this.c,this.a,this.b)==true)){
                this.flag1=1;
            }
            // test tam giac can
            else if(isoscelesTriangle(this.a,this.b,this.c)==true || isoscelesTriangle(this.b,this.c,this.a)==true ||isoscelesTriangle(this.c,this.a,this.b)==true ){
                this.flag2=1;
            }
        
        if(testTamGiac(this.a,this.b,this.c)==true || testTamGiac(this.b,this.c,this.a)==true || testTamGiac(this.c,this.a,this.b)==true){
            if(this.flag2==1 && this.flag1==1){
            System.out.println("Day la tam giac vuong can!");
            }
            else if(this.flag==1){
            System.out.println("Day la tam giac vuong!");
            }else if (this.flag1==1){
            System.out.println("Day la tam giac deu!");
            }else if(this.flag2==1){
            System.out.println("Day la tam giac can!");
            }else System.out.println("Day la tam giac binh thuong");
        }else System.out.println("k phai tam giac");
    }
    
    
}

