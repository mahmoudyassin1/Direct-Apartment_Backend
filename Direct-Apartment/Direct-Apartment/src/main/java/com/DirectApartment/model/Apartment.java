package com.DirectApartment.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "apartments")
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "city")
    private String city;
    @Column(name = "region")
    private String region;
    @Column(name = "area")

    private long area;
    @Column(name = "number_of_rooms")
    private Long number_of_rooms;
    @Column(name = "number_of_bathrooms")

    private Long number_of_bathrooms;
    @Column(name = "price")
    private Long price;
    @Column(name = "type")
    private String type;





}
