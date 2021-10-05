package com.example.resource.dto;

import com.example.domain.Advertisement;
import com.example.domain.Category;
import com.example.domain.Type;
import com.example.resource.dto.dto.AdvertisementDetailsDTO;
import com.example.resource.dto.dto.CreateAdvertisementDTO;

public class Mapper {

    public AdvertisementDetailsDTO toAdvertisementDetails (Advertisement advertisement) {
        return  new AdvertisementDetailsDTO(
                advertisement.getId().toString(),
                advertisement.getType().name(),
                advertisement.getCategory().name(),
                advertisement.getHeaderText(),
                advertisement.getText(),
                advertisement.getPrice(),
                advertisement.getMobile(),
                advertisement.getImgUrl()

        );
    }

    public Advertisement toCreateAdvertisement(CreateAdvertisementDTO advertisement) {
        return new Advertisement(
                Category.valueOf(advertisement.getCategory()),
                Type.valueOf(advertisement.getType()),
                advertisement.getHeaderText(),
                advertisement.getText(),
                advertisement.getPrice(),
                advertisement.getMobile(),
                advertisement.getImgUrl()
        );
    }


}
