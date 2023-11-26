package com.example.BookMyShowProject.RepositoryLayer;

import com.example.BookMyShowProject.Models.TheaterSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterSeatsRepository extends JpaRepository<TheaterSeat,Integer> {
}
