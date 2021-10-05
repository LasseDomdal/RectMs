package com.example.resource.dto.dto;

public class AdvertisementDetailsDTO {
    public final String id;
    public final String category;
    public final String type;
    public final String headerText;
    public final String text;
    public final double price;
    public final String mobile;
    public final String imgUrl;

    public AdvertisementDetailsDTO(String id, String category, String type, String headerText, String text, double price, String mobile, String imgUrl) {
        this.id = id;
        this.category = category;
        this.type = type;
        this.headerText = headerText;
        this.text = text;
        this.price = price;
        this.mobile = mobile;
        this.imgUrl = imgUrl;
    }

    public String getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
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
