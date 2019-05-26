/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db01;

import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class DB01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String connStr= ''
            
            Statement stmt = conn.creatStatement();
            // preparedStament
            
            
            String insertQuery = "insert into sach(masac,ten,tacgia,NXT,soluong)"
                    + "+value(?,?,?,?,?); 
            
            // insert du lieu
            String insertQuery = "INSERT INTO SACH" // giong nhu workbench
            int rowsUpdate = stmt.executeUpdate(insertQuery);
            System.out.println("Row: "+rowsUpdated);
            
            
            
            // thuc hien cau lenh selct va hien thi su kieu
            ResultSet rs = stmt.executeQuery("SELeCT * FROM SACH");
            while(rs.next()){
                System.out.println(rs.getString("Ten"));
                System.out.print(rs.getString(3)); //lay ra ten tac gia
                System.out.println(rs.getInt("So luong"));
            }
        }
    }
    
}
