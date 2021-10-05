package com.example.resource.dto.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateAdvertisementDTO {

    private final String type;
    private final String category;
    private final String mobile;
    public final String headerText;
    public final String text;
    public final double price;
    public final String imgUrl;



    @JsonCreator
    public CreateAdvertisementDTO(
            @JsonProperty("category") String category,
            @JsonProperty("type") String type,
            @JsonProperty("headerText") String headerText,
            @JsonProperty("text") String text,
            @JsonProperty("price") double price,
            @JsonProperty("mobile") String mobile,
            @JsonProperty("imgUrl") String imgUrl) {

        this.category = category;
        this.type = type;
        this.mobile = mobile;
        this.headerText = headerText;
        this.text = text;
        this.price = price;
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
