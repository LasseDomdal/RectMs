package com.example.domain;

import java.util.UUID;

public class Advertisement {

public final UUID id;
public Category category;
public Type type;
public String headerText;
public String text;
public double price;
public String mobile;
public String imgUrl;

    public Advertisement(Category category, Type type, String headerText, String text, double price, String mobile, String imgUrl) {
        this.id = UUID.randomUUID();
        this.category = category;
        this.type = type;
        this.headerText = headerText;
        this.text = text;
        this.price = price;
        this.mobile = mobile;
        this.imgUrl = imgUrl;
    }



    public UUID getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public Type getType() {
        return type;
    }

    public String getHeaderText() {
        return headerText;
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
