/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tqa.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DIGVIJAY
 */
public class DBConnection {

    private static Connection conn;

    static {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//DJ-PC:1521/XE", "project", "java");
            JOptionPane.showMessageDialog(null, "Connected Successfully To The DB", "SUCCESS!!", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error Loading The Driver Class : " + ex, "ERROR!!", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL ERROR : " + ex, "ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static Connection getConnection() {
        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
                JOptionPane.showMessageDialog(null, "Disconnected Successfully From The DB", "SUCCESS!!", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error Closing The Connection" + ex, "ERROR!!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
