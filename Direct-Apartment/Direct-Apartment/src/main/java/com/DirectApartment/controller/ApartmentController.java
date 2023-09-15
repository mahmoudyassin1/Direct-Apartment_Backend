package com.DirectApartment.controller;


import com.DirectApartment.model.Apartment;
import com.DirectApartment.model.apartment_search;
import com.DirectApartment.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApartmentController {

    @Autowired
    private ApartmentService apartmentService;

    @PostMapping("/add")
    public Apartment add_Apartment(@RequestBody Apartment apartment)
    {
        return apartmentService.add_apartment(apartment);
    }

    @GetMapping("/Search/{price}")
    public List<Apartment>findAllByPrice(@PathVariable("price)") Long price)
    {
        return apartmentService.findByPrice(price);
    }

    //findAll
    @GetMapping("/findAll")
    public List<Apartment>findAll()
    {
        return apartmentService.findAllApartment();
    }

    @GetMapping("/search")
    public List<Apartment> SearchInApartments(@RequestBody apartment_search apartmentSearch)
    {
        return apartmentService.SearchInApartments(apartmentSearch);
    }

    @DeleteMapping("/deleteAll")
    public void Delete()
    {
        apartmentService.Delete();
    }

    @GetMapping("/SelectByType/{type}")
    public List<Apartment>SelectByType(@PathVariable("type") String type)
    {
        return apartmentService.SelectByType(type);
    }

    @PutMapping("/update/{id}")
    public Apartment Update(@PathVariable("id") long id,@RequestBody Apartment apartment)
    {
        return apartmentService.update(id, apartment);
    }









}
