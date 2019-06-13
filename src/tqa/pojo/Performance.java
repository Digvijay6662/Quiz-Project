/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tqa.pojo;

/**
 *
 * @author DIGVIJAY
 */
public class Performance {

    public Performance() {
    }

    public Performance(String examid, String userid, int right, int wrong, int unattempted, double percentage, String language) {
        this.examid = examid;
        this.userid = userid;
        this.right = right;
        this.wrong = wrong;
        this.unattempted = unattempted;
        this.percentage = percentage;
        this.language = language;
    }

    public String getExamid() {
        return examid;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public int getUnattempted() {
        return unattempted;
    }

    public void setUnattempted(int unattempted) {
        this.unattempted = unattempted;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    private String examid;
    private String userid;
    private int right;
    private int wrong;
    private int unattempted;
    private double percentage;
    private String language;
}
