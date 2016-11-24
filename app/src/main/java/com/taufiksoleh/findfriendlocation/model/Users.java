package com.taufiksoleh.findfriendlocation.model;

/**
 * Created by taufiksoleh on 11/22/16.
 */

public class Users {
    private String UserID;
    private String Username;
    private String Password;
    private String Email;
    private String Handphone;
    private String Birthdate;
    private String Address;
    private String Gender;
    private String Status;

    public void setUserID(String userID) {
        UserID = userID;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setBirthdate(String birthdate) {
        Birthdate = birthdate;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setHandphone(String handphone) {
        Handphone = handphone;
    }

    public String getUserID() {
        return UserID;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public String getAddress() {
        return Address;
    }

    public String getGender() {
        return Gender;
    }

    public String getEmail() {
        return Email;
    }

    public String getHandphone() {
        return Handphone;
    }

    public String getStatus() {
        return Status;
    }
}
