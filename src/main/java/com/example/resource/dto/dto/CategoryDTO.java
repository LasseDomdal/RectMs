package com.example.resource.dto.dto;

public class CategoryDTO {

    private final int numberOfInt;
    private final String category;

    public CategoryDTO(int numberOfInt, String category) {
        this.numberOfInt = numberOfInt;
        this.category = category;
    }

    public int getNumberOfInt() {
        return numberOfInt;
    }

    public String getCategory() {
        return category;
    }
}
