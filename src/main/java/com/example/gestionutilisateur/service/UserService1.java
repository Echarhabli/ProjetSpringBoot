package com.example.gestionutilisateur.service;


import com.example.gestionutilisateur.domain.User;
import com.example.gestionutilisateur.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService1 {
    private  UserRepo userRepo;

    public  UserService1(UserRepo userRepo){
        this.userRepo =userRepo;
    }

    public void addUser(User user) {
        userRepo.save(user);

    }
}
