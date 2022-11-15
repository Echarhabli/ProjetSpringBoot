package com.example.gestionutilisateur.service;


import com.example.gestionutilisateur.domain.User;
import com.example.gestionutilisateur.repo.UserRepo;
import org.springframework.stereotype.Service;

@Service
public record UserService2 (UserRepo userRepo) {

    public void addUser(User user) {
        userRepo.save(user);

    }
}
