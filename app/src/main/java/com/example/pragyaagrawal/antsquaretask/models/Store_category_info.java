package com.example.pragyaagrawal.antsquaretask.models;

/**
 * Created by Pragya Agrawal on 12/3/2016.
 */
public class Store_category_info {
    private String id;

    private String icon;

    private String name;

    private String icon_url;

    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ClassPojo [id = " + id + ", icon = " + icon + ", name = " + name + ", icon_url = " + icon_url + ", type = " + type + "]";
    }
}
