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
import tqa.pojo.Exam;

/**
 *
 * @author DIGVIJAY
 */
public class ExamDAO {

    public static String getExamId() throws SQLException {
        int rowCount = 0;
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select count(*) as totalrows from exam");
        if (rs.next()) {
            rowCount = rs.getInt(1);
        }
        return "EX-" + (rowCount + 1);
    }

    public static void addExam(Exam newExam) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into exam values(?,?,?)");
        ps.setString(1, newExam.getExamId());
        ps.setString(2, newExam.getLanguage());
        ps.setInt(3, newExam.getTotalQuestions());
        ps.executeUpdate();
    }

    public static ArrayList<String> getExamIdBySubject(String subject) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select examid from exam where language=?");
        ps.setString(1, subject);
        ResultSet rs = ps.executeQuery();
        ArrayList<String> examList = new ArrayList();
        while (rs.next()) {
            examList.add(rs.getString(1));
        }
        return examList;
    }

    public static int getQuestionCountByExam(String examid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select total_question from exam where examid=?");
        ps.setString(1, examid);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
}
