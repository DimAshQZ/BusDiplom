package com.example.diploma_hospital.model;

public class Bus {
    public String email;
    public String userName;
    public String password;
    public String serialNum;
    public String userId;
    public String way;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public Bus() {
    }

    public Bus(String email, String userName, String password, String serialNum, String userId, String way) {
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.serialNum = serialNum;
        this.userId = userId;
        this.way = way;
    }
}
