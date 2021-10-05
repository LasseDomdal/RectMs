package com.example.resource.dto.dto;

public class CategoryDTO {

    private final int numberOfAds;
    private final String category;

    public CategoryDTO(int numberOfAds, String category) {
        this.numberOfAds = numberOfAds;
        this.category = category;
    }

    public int getNumberOfAds() {
        return numberOfAds;
    }

    public String getCategory() {
        return category;
    }
}


