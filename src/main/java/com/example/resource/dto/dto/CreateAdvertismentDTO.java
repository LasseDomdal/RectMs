package com.example.resource.dto.dto;

import com.example.domain.Category;
import com.example.domain.Type;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateAdvertismentDTO {

    private final Type type;
    private final Category category;
    private final String mobile;
    public final String headerText;
    public final String text;
    public final double price;
    public final String imgUrl;



    @JsonCreator
    public CreateAdvertismentDTO(
            @JsonProperty("type") Type type,
            @JsonProperty("category") Category category,
            @JsonProperty("mobile") String mobile,
            @JsonProperty("headerText") String headerText,
            @JsonProperty("text") String text,
            @JsonProperty("price") double price,
            @JsonProperty("imgUrl") String imgUrl) {

        this.type = type;
        this.category = category;
        this.mobile = mobile;
        this.headerText = headerText;
        this.text = text;
        this.price = price;
        this.imgUrl = imgUrl;

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
