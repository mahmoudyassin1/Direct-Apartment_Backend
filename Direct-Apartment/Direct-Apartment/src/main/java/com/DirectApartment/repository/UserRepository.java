package com.DirectApartment.repository;

import com.DirectApartment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

     // Define a custom query method to find a user by email and password
     @Query("SELECT u FROM User u WHERE u.email = :email AND u.password = :password")
     User findByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}