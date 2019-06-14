/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db01_bt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DB01_BT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            String connStr = "jdbc:mysql://localhost:3306/QLYTHUVIEN ";
//            Connection conn= DriverManager.getConnection(connStr,"root","root");
//            if(conn != null){
//                System.out.println("Ket noi thanh cong");
//                System.out.println("----------------");
//                // ket noi thanh cong
//                Statement stmt = conn.createStatement();
//                System.out.println("Hien thi ten khoa: ");
//                // thuc hien cau lenh select va hien thi du lieu
//                ResultSet rs= stmt.executeQuery("SELECT *FROM SACH");
//                while(rs.next()){
//                    System.out.println(rs.getString("ten"));
//                    
//                }
//                
//                
//            }
//            else {
//                System.out.println("Ket noi that bai!");
//            }
            Process p = new Process();
            Scanner input = new Scanner(System.in);
            System.out.print("Nhap ten sach: ");
            String name = input.nextLine();
            System.out.print("Nhap ngay muon (dd/mm/yyyy): ");
            String date = input.nextLine();

            ResultSet rs = p.ex6(name, date);
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
            homework7 hw7 = new homework7();
            hw7.ex7();
            homework8 hw8 = new homework8();
            hw8.ex8();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
