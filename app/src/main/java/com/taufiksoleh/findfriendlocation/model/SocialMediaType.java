package com.taufiksoleh.findfriendlocation.model;

/**
 * Created by taufiksoleh on 11/23/16.
 */

public class SocialMediaType {
    private String socialmediatype_id;
    private String socialmediatype_name;
    private String socialmediatype_status;

    public void setSocialmediatype_id(String socialmediatype_id) {
        this.socialmediatype_id = socialmediatype_id;
    }

    public void setSocialmediatype_name(String socialmediatype_name) {
        this.socialmediatype_name = socialmediatype_name;
    }

    public void setSocialmediatype_status(String socialmediatype_status) {
        this.socialmediatype_status = socialmediatype_status;
    }

    public String getSocialmediatype_id() {
        return socialmediatype_id;
    }

    public String getSocialmediatype_name() {
        return socialmediatype_name;
    }

    public String getSocialmediatype_status() {
        return socialmediatype_status;
    }
}
