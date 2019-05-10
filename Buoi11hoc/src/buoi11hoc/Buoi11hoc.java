/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi11hoc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Buoi11hoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 /*       
        // java 5 phai viet String dang sau(kieu du lieu dang nhau)
        // java > 5 se k phai viet String dang sau
        ArrayList<String> lists=  new ArrayList<String>();
        // khai bao list cung duoc do 
        // ten interface =  new Ten lop con
        // gan cho nhan nao se chua kieu du lieu do
        List<String> list=  new ArrayList<String>();
        // gan vao String hello
        list.add("Hello");
        //  * neu khong gan se la kieu du lieu object
        // * object la kieu du lieu co ban: so chu kieu gi cung duoc
         System.out.println(list.size());
         System.out.println(list.get(0));
         list.add("1");
         list.add("Haha");
         list.add("Hello");
 //        list.clear();
         System.out.println(list.size());
         // trimToSize(): xoa bo phan tu trang trong chuoi
         // phuong thuc nay khong su dung nhieu lam do co remove va clear
         list.remove("Hello");
         System.out.println("---------");
         for(int i=0;i<list.size();i++){
             System.out.println(list.get(i));
         }
         */
         List<String> stud= new ArrayList();
         stud.add("An");
         stud.add("Ngo");
         stud.add("Nam");
         
         List<Student> st = new ArrayList<>();
         st.add(new Student(1,"Manh"));
         st.add(new Student(2,"Lala"));
         
         
         boolean remove = stud.remove("An");
         System.out.println(remove);
         for(String i: stud){
             System.out.println(i);
         }
         
         
    }
    
}
