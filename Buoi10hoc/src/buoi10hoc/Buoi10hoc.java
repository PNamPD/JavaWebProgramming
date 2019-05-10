/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi10hoc;

import java.io.File;

/**
 *
 * @author ASUS
 */
public class Buoi10hoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File Ultis fu = new File(Utils);
        try{
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    
        File f= new File(/* file truyen vao*/ );
        if(f.exists()){
            if(if.isFile()){
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getPath());
            System.out.println(f.getName());
            
            
            }
            else{
                 System.out.println("Day  la file");   
            }
        }else {
            System.out.println("Day k phai la file");
            // in ra ten trong folder
            String list = f.list();
            for(String name: list){
                System.out.println(name);
            }
            // in ra duong dan
            File[] file = f.listFiles();
            for(File file : file){
                if(file.getName().endsWith(".java")){
                        file.delate;
            }
            
            
        }
    }
    
}
