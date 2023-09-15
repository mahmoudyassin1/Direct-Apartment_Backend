package com.DirectApartment.service;

import com.DirectApartment.model.User;
import com.DirectApartment.model.user_login;
import com.DirectApartment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //To Save New User In DataBase (User Table)
    public User sign_Up(User user)
    {
        return userRepository.save(user);
    }

    //Delete User From DateBase
    public void DeleteUser(Long id)
    {
        userRepository.deleteById(id);
    }

    //Login User
    public User login(user_login userLogin)
    {
        return  userRepository.findByEmailAndPassword(userLogin.getEmail(),userLogin.getPassword());
    }

    //show users
    public List<User> showAll()
    {
        return userRepository.findAll();
    }




}
