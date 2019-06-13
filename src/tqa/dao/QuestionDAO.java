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
import java.util.ArrayList;
import tqa.dbutil.DBConnection;
import tqa.pojo.Question;
import tqa.pojo.QuestionStore;

/**
 *
 * @author DIGVIJAY
 */
public class QuestionDAO {

    public static void addQuestions(QuestionStore qstore) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into question values (?,?,?,?,?,?,?,?,?)");
        ArrayList<Question> questionList = qstore.getAllQuestions();
        for (Question q : questionList) {
            ps.setString(1, q.getExamid());
            ps.setInt(2, q.getQno());
            ps.setString(3, q.getQuestion());
            ps.setString(4, q.getAnswer1());
            ps.setString(5, q.getAnswer2());
            ps.setString(6, q.getAnswer3());
            ps.setString(7, q.getAnswer4());
            ps.setString(8, q.getCorrectAnswer());
            ps.setString(9, q.getLanguage());
            ps.executeUpdate();
        }
    }

    public static ArrayList<Question> getQuestionsByExamId(String examid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from question where examid=? order by qno");
        ArrayList<Question> questionList = new ArrayList();
        ps.setString(1, examid);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Question q = new Question(rs.getString(1), rs.getInt(2), rs.getString(9), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(3));
            questionList.add(q);
        }
        return questionList;
    }

    public static void updateQuestions(QuestionStore qstore) throws SQLException {
        int ans = 100;
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update question set examid=?,qno=?,question=?,answer1=?,answer2=?,answer3=?,answer4=?,correct_answer=?,language=? where examid=? and qno=?");
        ArrayList<Question> questionList = qstore.getAllQuestions();
        for (Question q : questionList) {
            ps.setString(1, q.getExamid());
            ps.setInt(2, q.getQno());
            ps.setString(3, q.getQuestion());
            ps.setString(4, q.getAnswer1());
            ps.setString(5, q.getAnswer2());
            ps.setString(6, q.getAnswer3());
            ps.setString(7, q.getAnswer4());
            ps.setString(8, q.getCorrectAnswer());
            ps.setString(9, q.getLanguage());
            ps.setString(10, q.getExamid());
            ps.setInt(11, q.getQno());
            ans = ps.executeUpdate();
        }
    }
}
