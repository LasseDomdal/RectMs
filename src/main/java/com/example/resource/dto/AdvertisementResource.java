package com.example.resource.dto;


import com.example.domain.Advertisement;
import com.example.resource.dto.dto.AdvertisementDetailsDTO;
import com.example.resource.dto.dto.CreateAdvertisementDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/advertisements")
public class AdvertisementResource {

    private Mapper mapper = new Mapper();
    public static List<Advertisement> advertisements = new ArrayList<>();

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public List<Advertisement> getAdvertisements() {
        return advertisements;
    }



    @Produces(MediaType.APPLICATION_JSON)
    @GET
    @Path("/{id}")
    public AdvertisementDetailsDTO getAdvertisement(@PathParam("id") String id) {
        return advertisements.stream()
                .filter(a -> a.getId().toString().equals(id))
                .map(mapper::toAdvertisementDetails)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Not found"));
    }


    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @POST
    public AdvertisementDetailsDTO createAdvertisement (CreateAdvertisementDTO createAdvertisementDTO) {
        Advertisement ad = mapper.toCreateAdvertisement(createAdvertisementDTO);
        advertisements.add(ad);
        return mapper.toAdvertisementDetails(ad);
    }




}
