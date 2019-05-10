/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi10bt1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class FileUtils {
    File file;

    public FileUtils() {
        
    }

   
    public void Test() throws IOException{
        File f= new File("E:\\demo");
        // kiem tra xem co la file hay la thu muc
        // kiem tra su ton tai 
        
        if(f.exists()){
            // kiem tra xem phai la file k

            if(f.isFile()){
                
            // kiem tra xem co phai la forder hay khong
            System.out.println("isDirectory: "+f.isDirectory());
            System.out.println("AbsolutaFIle: "+f.getAbsoluteFile()); // lay ra duong dan tuyet doi
            // cai nay la de kiem tra bao nhieu byte
            System.out.println("Byte: "+f.length()+" byte");
            // tra ve cac thu muc goc
/*            File[] roots =  File.listRoots();
            for(File root : roots){
                System.out.println(root.getAbsoluteFile());
            }*/
           
        }
        else
            // cai nay khong phai file ma la thu muc
        {
            System.out.println("Day k phai la file!");
            File[] path = f.listFiles();
            // duyet cac phan tu file trong mang path
            // cac phan tu ten oo
            long lastMofifyInMillis = f.lastModified();
            Date lastMoodifyDate = new Date (lastMofifyInMillis);
            System.out.println("Time "+lastMoodifyDate);
            for (File oo  : path) {
                // kiem tra co phai file hay ko
                
                    if(oo.isFile()){
                        if(oo.getName().endsWith(".txt")){
                            long lm = oo.lastModified();
 //                           System.out.println(" "+lm);
                            Date ld = new Date (lm);
                            System.out.println("Time "+ld);
                            System.out.println("File txt: "+oo.getAbsolutePath());
                            
                            if(oo.length()>1024){
                                long type = oo.length()/1024;
                                System.out.println("Type: "+type+" Mb");
                            }
                            else  System.out.println("Type: "+oo.length()+" kb");
                            
                            System.out.println("");
                        }
                        else if(oo.getName().endsWith(".jpg")){
                            System.out.println("FIle jpg: "+oo.getAbsoluteFile());
                            System.out.println("Byte: "+oo.length()+" byte");
                            System.out.println("");
                        }
                    }
                    else {
                        System.out.println("Folder: "+oo.getAbsoluteFile());
                        System.out.println("");
                        
                    }
                //    System.out.println("String "+ st.getParent());
                }
            
            
            }
        }
        
    }
    
    
}
