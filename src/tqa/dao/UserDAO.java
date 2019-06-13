/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tqa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import tqa.dbutil.DBConnection;
import tqa.pojo.UserDTO;

/**
 *
 * @author DIGVIJAY
 */
public class UserDAO {

    public static boolean checkUser(UserDTO user) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from users where userid=? and password=? and usertype=?");
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType());
        int ans = ps.executeUpdate();
        return ans != 0;
    }

    public static boolean addUser(UserDTO user) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from users where userid=?");
        ps.setString(1, user.getUserId());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return false;
        }
        ps = conn.prepareStatement("insert into users values(?,?,?)");
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType());
        int ans = ps.executeUpdate();
        return ans != 0;
    }

    public static boolean updateUser(String userid, String password) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update users set password=? where userid =? ");
        ps.setString(1, password);
        ps.setString(2, userid);
        int ans = ps.executeUpdate();
        return ans != 0;
    }
}
