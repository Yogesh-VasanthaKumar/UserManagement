package com.management.usermanagementsystem.model;

public class Usermanagementmodel {
    private int userID;
    private String name;
    private String userName;
    private String address;
    private int phonenumber;

    public Usermanagementmodel() {
    }

    public Usermanagementmodel(int userID, String name, String userName, String address, int phonenumber) {
        this.userID = userID;
        this.name = name;
        this.userName = userName;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "UserDetails \n" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }
}
