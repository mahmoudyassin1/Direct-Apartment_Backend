package com.DirectApartment.service;

import com.DirectApartment.model.Apartment;
import com.DirectApartment.model.apartment_search;
import com.DirectApartment.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApartmentService {

    @Autowired
    private ApartmentRepository apartmentRepository;

    //save
    public Apartment add_apartment(Apartment apartment)
    {
        return apartmentRepository.save(apartment);
    }

    //findAll by price
    public List<Apartment> findByPrice(Long price)
    {
        return apartmentRepository.find_all_by_price(price);
    }

    public List<Apartment>findAllApartment()
    {
        return apartmentRepository.findAll();
    }
    public List<Apartment>SearchInApartments(apartment_search apartmentSearch)
    {
        return apartmentRepository.SEARCH(apartmentSearch.getCity(),apartmentSearch.getRegion(),apartmentSearch.getType(),apartmentSearch.getLowPrice(),apartmentSearch.getHighPrice());
    }

    public void Delete()
    {
        apartmentRepository.deleteAll();
    }

    public List<Apartment>SelectByType(String type)
    {
        return apartmentRepository.SelectByType(type);
    }

    //
    public Apartment update(long id,Apartment apartment1)
    {
        Apartment apartment=apartmentRepository.findById(id).get();

        apartment.setType(apartment1.getType());
        apartment.setArea(apartment1.getArea());
        apartment.setPrice(apartment1.getPrice());
        apartment.setCity(apartment1.getCity());
        apartment.setRegion(apartment1.getRegion());
        apartment.setNumber_of_bathrooms(apartment1.getNumber_of_bathrooms());
        apartment.setNumber_of_rooms(apartment1.getNumber_of_rooms());

        apartmentRepository.save(apartment);
        return apartment;

    }


}
