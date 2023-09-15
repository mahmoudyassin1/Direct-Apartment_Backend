package com.DirectApartment.repository;

import com.DirectApartment.model.Apartment;
import com.DirectApartment.model.apartment_search;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ApartmentRepository extends JpaRepository<Apartment,Long> {


   // @Query("Select * WHERE price < :price")
    @Query(value = "SELECT * FROM apartments WHERE price < :pricee",nativeQuery = true)
    public List<Apartment>find_all_by_price(Long pricee);

    @Query(value = "SELECT * FROM apartments WHERE  city= :city AND region= :region AND type= :type AND price> :lowPrice AND price < :highPrice",nativeQuery = true)
    public List<Apartment>SEARCH(String city,String region,String type,Long lowPrice,Long highPrice);

    @Query(value = "SELECT * FROM apartments WHERE city= :address_city & price> :lowPrice & price < :highPrice",nativeQuery = true)
    public List<Apartment>SEARCH2(String address_city,Long lowPrice,Long highPrice);

    @Query(value = "SELECT * FROM apartments WHERE type= :type",nativeQuery = true)
    public List<Apartment>SelectByType(String type);

}
