package com.example.resource.dto;


import com.example.domain.Advertisement;

import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Path("advertisement")
public class AdvertisementResource {

    private static List<Advertisement> advertisements = new ArrayList<>();

//    @Produces(MediaType.APPLICATION_JSON)
//    @GET
//
//
//    @Produces(MediaType.APPLICATION_JSON)
//    @GET
//    @Path("/{sn}")

//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    @POST
//    public AdvertisementDetailsTDo createAdvertisement (CreateAdvertismentDTO createAdvertismentDTO) {
//        AdvertisementDetailsTDo ad = new AdvertisementDetailsTDo(createAdvertismentDTO.getType(), createAdvertismentDTO.getCategory(),
//                createAdvertismentDTO.getMobile(), createAdvertismentDTO.getHeaderText(),
//                createAdvertismentDTO.getText(), createAdvertismentDTO.getPrice(),
//                createAdvertismentDTO.getImgUrl());
//        advertisement.add(ad);
//        return ad;
    }


}
