/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_17;

/**
 *
 * @author ASUS
 */
public class TestMyCircle {
    public static void main(String[] args){
        MyPoint m= new MyPoint(3,4);
        System.out.println(m);
        MyCircle k= new MyCircle();
        k.Info();
        System.out.println(k);
        MyCircle a1 = new MyCircle(3,4,5);
        System.out.println(a1);
    }
}
