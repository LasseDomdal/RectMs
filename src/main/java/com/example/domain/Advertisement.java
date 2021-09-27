package com.example.domain;

public class Advertisement {

public String id;
public Category category;
public Type type;
public String HeaderText;
public String text;
public double price;
public String mobile;
public String imgUrl;

    public Advertisement(String id, Category category, Type type, String headerText, String text, double price, String mobile, String imgUrl) {
        this.id = id;
        this.category = category;
        this.type = type;
        HeaderText = headerText;
        this.text = text;
        this.price = price;
        this.mobile = mobile;
        this.imgUrl = imgUrl;
    }

    public String getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public Type getType() {
        return type;
    }

    public String getHeaderText() {
        return HeaderText;
    }

    public String getText() {
        return text;
    }

    public double getPrice() {
        return price;
    }

    public String getMobile() {
        return mobile;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
