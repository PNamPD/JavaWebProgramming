/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db01_bt;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ASUS
 */
class DBConnector {
    public Connection getConnect() throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
        String conStr = "jdbc:mysql://localhost:3306/QLYTHUVIEN";
        Connection conn = DriverManager.getConnection(conStr, "root", "root");
        return conn;
    }
}
