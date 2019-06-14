/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db01_bt;

import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class homework7 {
    public void ex7( ) throws Exception{
        DBConnector dBConnector = new DBConnector();
        Connection conn = dBConnector.getConnect();
        String sql = "select d.sothe, d.ten, s.ten from PHIEUMUON p\n" +
                        "join SACH s on s.masach = p.masach \n" +
                        "join DOCGIA d on d.sothe = p.sothe\n" +
                        "where p.ngaymuon between '?' and '?'";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(1));
            System.out.println(rs.getString("d.ten"));
            System.out.println(rs.getString("s.ten"));
        }
    }
}
