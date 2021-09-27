package com.example.resource.dto.dto;

import com.example.domain.Category;
import com.example.domain.Type;

public class AdvertismentDTO {

//    liste data med mulighed for query params type,category,mobile
    private final Type type;
    private final Category category;
    private final String mobile;
    public final String HeaderText;
    public final String text;
    public final double price;

    public AdvertismentDTO(Type type, Category category, String mobile, String headerText, String text, double price) {
        this.type = type;
        this.category = category;
        this.mobile = mobile;
        HeaderText = headerText;
        this.text = text;
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public Category getCategory() {
        return category;
    }

    public String getMobile() {
        return mobile;
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
}
