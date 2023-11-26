package com.example.BookMyShowProject.RepositoryLayer;

import com.example.BookMyShowProject.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}