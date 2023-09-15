package com.DirectApartment.model;

import lombok.Data;

@Data
public class apartment_search {

    private String city;
    private String region;
    private Long lowPrice;
    private Long highPrice;
    private String type;


}
