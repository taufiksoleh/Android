package com.taufiksoleh.findfriendlocation.model;

/**
 * Created by taufiksoleh on 11/23/16.
 */

public class SocialMedia {
    private String socialmedia_id;
    private String socialmedia_account;
    private String socialmedia_status;
    private String socialmedia_type;
    private String user_id;

    public void setSocialmedia_id(String socialmedia_id) {
        this.socialmedia_id = socialmedia_id;
    }

    public void setSocialmedia_account(String socialmedia_account) {
        this.socialmedia_account = socialmedia_account;
    }

    public void setSocialmedia_status(String socialmedia_status) {
        this.socialmedia_status = socialmedia_status;
    }

    public void setSocialmedia_type(String socialmedia_type) {
        this.socialmedia_type = socialmedia_type;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getSocialmedia_id() {
        return socialmedia_id;
    }

    public String getSocialmedia_account() {
        return socialmedia_account;
    }

    public String getSocialmedia_status() {
        return socialmedia_status;
    }

    public String getSocialmedia_type() {
        return socialmedia_type;
    }

    public String getUser_id() {
        return user_id;
    }
}
