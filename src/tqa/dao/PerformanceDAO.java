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
import java.util.ArrayList;
import tqa.dbutil.DBConnection;
import tqa.pojo.Performance;
import tqa.pojo.StudentScore;

/**
 *
 * @author DIGVIJAY
 */
public class PerformanceDAO {

    public static ArrayList<String> getAllStudentId() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select distinct userid from performance");
        ArrayList<String> idList = new ArrayList();
        while (rs.next()) {
            idList.add(rs.getString(1));

        }
        return idList;
    }

    public static ArrayList<String> getAllExamId(String userid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select examid from performance where userid = ?");
        ps.setString(1, userid);
        ArrayList<String> examIdList = new ArrayList();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            examIdList.add(rs.getString(1));
        }
        return examIdList;
    }

    public static StudentScore getScore(String studentid, String examid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select per,language from performance where userid = ? and examid=?");
        ps.setString(1, studentid);
        ps.setString(2, examid);
        ResultSet rs = ps.executeQuery();
        StudentScore ss = new StudentScore();
        rs.next();
        ss.setLanguage(rs.getString(2));
        ss.setPer(rs.getDouble(1));
        return ss;
    }

    public static ArrayList<Performance> getAllData() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from performance");
        ArrayList<Performance> performance = new ArrayList();
        while (rs.next()) {
            Performance p = new Performance();
            p.setUserid(rs.getString(1));
            p.setExamid(rs.getString(2));
            p.setRight(rs.getInt(3));
            p.setWrong(rs.getInt(4));
            p.setUnattempted(rs.getInt(5));
            p.setPercentage(rs.getDouble(6));
            p.setLanguage(rs.getString(7));
            performance.add(p);
        }
        return performance;
    }

    public static void addPerformance(Performance performance) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into performance values(?,?,?,?,?,?,?)");
        ps.setString(1, performance.getUserid());
        ps.setString(2, performance.getExamid());
        ps.setInt(3, performance.getRight());
        ps.setInt(4, performance.getWrong());
        ps.setInt(5, performance.getUnattempted());
        ps.setDouble(6, performance.getPercentage());
        ps.setString(7, performance.getLanguage());
        ps.executeUpdate();
    }
}
