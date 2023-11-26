package com.example.BookMyShowProject.RepositoryLayer;

import com.example.BookMyShowProject.Models.Movie;
import com.example.BookMyShowProject.Models.Show;
import com.example.BookMyShowProject.Models.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalTime;

public interface ShowRepository extends JpaRepository<Show,Integer> {


    Show findShowByShowDateAndShowTimeAndMovieAndTheater(LocalDate showDate, LocalTime showTime, Movie movie, Theater theater);

}
