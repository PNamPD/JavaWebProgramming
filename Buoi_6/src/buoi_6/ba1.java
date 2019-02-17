/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
// nhap vao so nguyen 2 chu so va in ra cach doc
public class ba1 {
    
    public static void main(String[] args){
        int chuso,donvi;
        System.out.print("Nhap vao so nguyen : ");
        Scanner bc = new Scanner(System.in);
        chuso=bc.nextInt();
        
        donvi=chuso%10;
        chuso=chuso/10;
        System.out.print("Chuyen sang cho viet: ");
        switch(chuso){
            case 1:
                System.out.print("muoi ");
                break;
            case 2:
                System.out.print("hai muoi ");
                break;
            case 3:
                System.out.print("ba muoi ");
                break;
            case 4:
                System.out.print("bon ");
                break;
            case 5:
                System.out.print("nam ");
                break;
            case 6:
                System.out.print("sau ");
                break;
            case 7:
                System.out.print("bay ");
                break;
            case 8:
                System.out.print("tam ");
                break;
            case 9:
                System.out.print("chin ");
                break;    
        }
        switch(donvi){
            case 1:
                System.out.print("mot nghin");
                break;
            case 2:
                System.out.print("hai nghin");
                break;
            case 3:
                System.out.print("ba nghin");
                break;
            case 4:
                System.out.print("bon nghin");
                break;
            case 5:
                System.out.print("nam nghin");
                break;
            case 6:
                System.out.print("sau nghin");
                break;
            case 7:
                System.out.print("bay nghin");
                break;
            case 8:
                System.out.print("tam nghin");
                break;
            case 9:
                System.out.print("chin nghin");
                break;    
        }
    }
}
