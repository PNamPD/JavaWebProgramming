/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db02_bt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class StudentManager {
    Connection conn;
    public StudentManager() throws ClassNotFoundException, SQLException, Exception {
        DBconnect db = new DBconnect();
        this.conn = db.getConnect();
    }
    public boolean login(String email, String pass) throws SQLException{
        String query = "SELECT * FROM student WHERE email = ? AND pass = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setString(1, email);
        pstmt.setString(2, pass);      
        ResultSet rs = pstmt.executeQuery();
        return rs.next(); // tra ve true neu co du lieu, no next duoc
        // tra ve false neu no k co du lieu tiep theo
    }
    public int addAnswer(Students s, Question q,String answer ) throws SQLException{
        String query= "INSERT into student_question values (?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, s.getId());
        pstmt.setInt(2, q.getId());
        pstmt.setString(3, q.getContent());
        int executeUpdate = pstmt.executeUpdate();
        return executeUpdate;
    }
}
