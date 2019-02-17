
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

// in ra tam giac can dac
public class bai4 {
    public static void main(String[] args){
        Scanner bc= new Scanner(System.in);
        int h=4;
        
        // hang
        for(int i=0;i<h;i++){
            // dau cach trong hang
            for(int k=h-i-1;k>=0;k--){
                System.out.print(" ");
            }
            // cot
            for(int j=0;j<(2*i)+1;j++){
                // neu thoa man dieu kien 2^n+1 thi in ra dau sao
                System.out.print("*");
            }
            System.out.println("");
            
        }
        
        System.out.println("");
        for(int i=0;i<h;i++){
            // dau cach trong hang
            // so dau cach van giu nguyen
            for(int k=h-i-1;k>=0;k--){
                System.out.print(" ");
            }
            // cot
             // neu thoa man dieu kien 2^n+1 thi in ra dau sao

           
          
            for(int j=0;j<(2*i)+1;j++){
                // neu i=0 va i=cuoi thi in ra het *
                // neu j= dau va j=cuoi thi se in ra dau sao, neu khong thi sein dau cach
            if(i==0 || i==h-1){
               for(int k=0;k<(2*i)+1;k++){
                   System.out.print("*");
               }
               break;
            }
                
            else  if(j==0 || j==(2*i)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
            
        }
    }
}
