/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi10bt1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class SimpleVim {
    public void Input() throws IOException{
        InputStreamReader cin= null;
        cin= new InputStreamReader(System.in);
        File save = new File("E:\\demo\\java.txt");
        FileWriter con = new FileWriter(save);
        System.out.println("Nhap vao ki tu, an 'q' de thoat ra: ");
        char c;
        int index;
        
        do{
            c= (char) cin.read();
            con.write(c);
            System.out.println(c);
        }while(c!='q');
        
        
    }
}
