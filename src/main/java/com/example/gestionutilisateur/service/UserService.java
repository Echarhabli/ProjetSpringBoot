package com.example.gestionutilisateur.service;


import com.example.gestionutilisateur.domain.A;
import com.example.gestionutilisateur.domain.A1;
import com.example.gestionutilisateur.domain.User;
import com.example.gestionutilisateur.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // partie metier

public class UserService {
     @Autowired  private  UserRepo userRepo;

    public void addUser(User user) {
        userRepo.save(user);
    }


    public List<User> getUserByFirstName(String firstName) {
       return userRepo.findByFirstName(firstName);
    }
    public List<User> getUsers(){
        return userRepo.findAll();

    }
    public void deleteUser(User user){
        userRepo.delete(user);

    }
    public void deleteUser(Long id){
        userRepo.delete(userRepo.findById(id).get());

    }

}
