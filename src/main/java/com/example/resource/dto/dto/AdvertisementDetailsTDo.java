package com.example.resource.dto.dto;

import com.example.domain.Category;
import com.example.domain.Type;

public class AdvertisementDetailsTDo {
    public final String id;
    public final Category category;
    public final Type type;
    public final String HeaderText;
    public final String text;
    public final double price;
    public final String mobile;
    public final String imgUrl;

    public AdvertisementDetailsTDo(String id, Category category, Type type, String headerText, String text, double price, String mobile, String imgUrl) {
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
