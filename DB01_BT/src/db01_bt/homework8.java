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
public class homework8 {
    public void ex8( ) throws Exception{
        DBConnector dBConnector = new DBConnector();
        Connection conn = dBConnector.getConnect();
        String sql = "select s.* from SACH s\n" +
                    "where s.masach not in (select masach from PHIEUMUON)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(1));
            System.out.println(rs.getString("d.ten"));
            System.out.println(rs.getString("s.ten"));
        }
    }
}
