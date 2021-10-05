package com.example.resource.dto;


import com.example.domain.Category;
import com.example.resource.dto.dto.CategoryDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Path("/categories")
public class CategoriesResource {

    @GET
    public List<CategoryDTO> getCategories() {
        return Arrays.stream(Category.values())
                .map(c -> new CategoryDTO((int) AdvertisementResource.advertisements.stream().filter(a -> a.getCategory() == c).count(), c.name()))
                        .collect(Collectors.toList());
    }

}
