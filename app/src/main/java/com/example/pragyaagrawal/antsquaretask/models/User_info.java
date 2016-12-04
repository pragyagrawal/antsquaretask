package com.example.pragyaagrawal.antsquaretask.models;

/**
 * Created by Pragya Agrawal on 12/3/2016.
 */
public class User_info {

    private String is_following;

    private String total_followers_string;

    private String given_name;

    private String total_moment_likes;

    private String picture;

    private String id;

    private String username;

    private String total_moment_likes_string;

    private String name;

    private String family_name;

    private String total_followings;

    private String total_followings_string;

    private String total_followers;

    public String getIs_following ()
    {
        return is_following;
    }

    public void setIs_following (String is_following)
    {
        this.is_following = is_following;
    }

    public String getTotal_followers_string ()
    {
        return total_followers_string;
    }

    public void setTotal_followers_string (String total_followers_string)
    {
        this.total_followers_string = total_followers_string;
    }

    public String getGiven_name ()
    {
        return given_name;
    }

    public void setGiven_name (String given_name)
    {
        this.given_name = given_name;
    }

    public String getTotal_moment_likes ()
    {
        return total_moment_likes;
    }

    public void setTotal_moment_likes (String total_moment_likes)
    {
        this.total_moment_likes = total_moment_likes;
    }

    public String getPicture ()
    {
        return picture;
    }

    public void setPicture (String picture)
    {
        this.picture = picture;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getTotal_moment_likes_string ()
    {
        return total_moment_likes_string;
    }

    public void setTotal_moment_likes_string (String total_moment_likes_string)
    {
        this.total_moment_likes_string = total_moment_likes_string;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getFamily_name ()
    {
        return family_name;
    }

    public void setFamily_name (String family_name)
    {
        this.family_name = family_name;
    }

    public String getTotal_followings ()
    {
        return total_followings;
    }

    public void setTotal_followings (String total_followings)
    {
        this.total_followings = total_followings;
    }

    public String getTotal_followings_string ()
    {
        return total_followings_string;
    }

    public void setTotal_followings_string (String total_followings_string)
    {
        this.total_followings_string = total_followings_string;
    }

    public String getTotal_followers ()
    {
        return total_followers;
    }

    public void setTotal_followers (String total_followers)
    {
        this.total_followers = total_followers;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [is_following = "+is_following+", total_followers_string = "+total_followers_string+", given_name = "+given_name+", total_moment_likes = "+total_moment_likes+", picture = "+picture+", id = "+id+", username = "+username+", total_moment_likes_string = "+total_moment_likes_string+", name = "+name+", family_name = "+family_name+", total_followings = "+total_followings+", total_followings_string = "+total_followings_string+", total_followers = "+total_followers+"]";
    }
}
