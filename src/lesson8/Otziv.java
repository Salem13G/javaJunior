package lesson8;

import java.util.Date;

public class Otziv {
    private String clientsName;
    private int age;
    private String plus;
    private String minus;
    private String comments;
    private int like;
    private int dislike;


    private String dateComment;
    private double raiting;
    private boolean buyedHere;

    public String getClientsName() {
        return clientsName;
    }

    public void setClientsName(String clientsName) {
        this.clientsName = clientsName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlus() {
        return plus;
    }
    public String getDateComment() {
        return dateComment;
    }

    public void setDateComment(String dateComment) {
        this.dateComment = dateComment;
    }


    public void setPlus(String plus) {
        this.plus = plus;
    }

    public String getMinus() {
        return minus;
    }

    public void setMinus(String minus) {
        this.minus = minus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }



    public double getRaiting() {
        return raiting;
    }

    public void setRaiting(double raiting) {
        this.raiting = raiting;
    }

    public boolean isBuyedHere() {
        return buyedHere;
    }

    public void setBuyedHere(boolean buyedHere) {
        this.buyedHere = buyedHere;
    }
}
