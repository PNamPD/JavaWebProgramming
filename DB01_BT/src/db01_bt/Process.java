/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db01_bt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class Process {
     public ResultSet ex6(String bookName, String date) throws Exception{
        //1. Ket noi db
        DBConnector dBConnector = new DBConnector();
        Connection conn = dBConnector.getConnect();
        String sql = "select d.ten from qlythuvien.phieumuon p " +
                    "join qlythuvien.sach s on s.masach = p.masach " +
                    "join qlythuvien.docgia d on d.sothe = p.sothe " +
                    "where s.ten = ? and p.ngaymuon = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, bookName);
        pstmt.setString(2, date);
        
        return pstmt.executeQuery();
    }
}
