package com.taufiksoleh.findfriendlocation.model;

/**
 * Created by taufiksoleh on 11/23/16.
 */

public class Feeds {
    private String feeds_id;
    private String user_id;
    private String feeds_datetime;
    private String feeds_latitude;
    private String feeds_longitude;

    public void setFeeds_id(String feeds_id) {
        this.feeds_id = feeds_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setFeeds_datetime(String feeds_datetime) {
        this.feeds_datetime = feeds_datetime;
    }

    public void setFeeds_latitude(String feeds_latitude) {
        this.feeds_latitude = feeds_latitude;
    }

    public void setFeeds_longitude(String feeds_longitude) {
        this.feeds_longitude = feeds_longitude;
    }

    public String getFeeds_id() {
        return feeds_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getFeeds_datetime() {
        return feeds_datetime;
    }

    public String getFeeds_latitude() {
        return feeds_latitude;
    }

    public String getFeeds_longitude() {
        return feeds_longitude;
    }
}
