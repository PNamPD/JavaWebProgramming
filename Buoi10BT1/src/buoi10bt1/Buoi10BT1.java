    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi10bt1;

import java.io.File;
import java.util.Date;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author ASUS
 */
public class Buoi10BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        File fu = new File("E:\\demo");
        SimpleVim meo = new SimpleVim();
        try{
            FileUtils a = new FileUtils();
            a.Test();
            meo.Input();
            
        }catch(Exception e){
            System.out.println("Fail!");
        }
/*        InputStreamReader cin = null; 

      try {
         cin = new InputStreamReader(System.in);
         System.out.println("Nhap cac ky tu, 'q' de thoat.");
         char c;
         do {
            c = (char) cin.read();
            System.out.print(c);
         } while(c != 'q');
      }finally {
         if (cin != null) {
            cin.close();
         }
      }
       */     
    }
    
}
