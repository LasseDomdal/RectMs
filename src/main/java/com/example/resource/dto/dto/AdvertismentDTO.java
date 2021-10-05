package com.example.resource.dto.dto;

public class AdvertismentDTO {

//    liste data med mulighed for query params type,category,mobile
    private final String type;
    private final String category;
    private final String mobile;
    public final String headerText;
    public final String text;
    public final double price;
    public final String imgUrl;

    public AdvertismentDTO(String type, String category, String mobile, String headerText, String text, double price, String imgUrl) {
        this.category = category;
        this.type = type;
        this.headerText = headerText;
        this.text = text;
        this.price = price;
        this.mobile = mobile;
        this.imgUrl = imgUrl;



    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public String getMobile() {
        return mobile;
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

    public String getImgUrl() {
        return imgUrl;
    }
}
