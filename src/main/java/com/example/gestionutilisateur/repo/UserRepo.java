package com.example.gestionutilisateur.repo;

import com.example.gestionutilisateur.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {
     List<User> findByFirstName(String firstName);

}
