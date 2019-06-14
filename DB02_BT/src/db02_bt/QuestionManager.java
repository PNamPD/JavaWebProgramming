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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
/**
 *
 * @author ASUS
 */
public class QuestionManager {
    // khai bao quan ly cau hoi
    private Connection conn = null ;
    public QuestionManager () throws ClassNotFoundException, SQLException {
        // khai bao ket noi db
        DBconnect db = new DBconnect();
        //conn = db connect
        this.conn= db.getConnect();  
        
    }
    public List<Question> getQuestion() throws ClassNotFoundException, SQLException{
        //          -- Buoc 1 --  ket noi db 
        //         --- Buoc 2 --  tao cau truy van query
        String query = "select * from question";
        //        ---  Buoc 3 -- thuc thi cau lenh
        
        // kieu du lieu de thuc thi cau lenh select
        Statement  stmt = this.conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        
        
        
        //      --- Buoc 4 --  duyet ket qua va add vao list
        List<Question> list = new ArrayList<>(); // tao danh sach list
        while(rs.next()){
            Question q= new Question();
            q.setId(rs.getInt("id"));
            q.setContent(rs.getString("content"));
            q.setAnswerA(rs.getString("answer_a"));
            q.setAnswerB(rs.getString("answer_b"));
            q.setAnswerC(rs.getString("answer_c"));
            q.setAnswerD(rs.getString("answer_d"));
            q.setCorrect(rs.getString("correct"));
            list.add(q);
        }
        
        
        return list;
    }
     
}
