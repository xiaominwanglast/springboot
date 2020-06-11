package com.example.demo.bo;

public class UserLogin {
    private String passWord;

    private String userName;

    public UserLogin(){}

    public UserLogin(String passWord,String userName){
        this.passWord=passWord;
        this.userName=userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "passWord='" + passWord + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
