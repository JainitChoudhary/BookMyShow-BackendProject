package com.example.BookMyShowProject.ServiceLayer;

import com.example.BookMyShowProject.Models.Movie;
import com.example.BookMyShowProject.RepositoryLayer.MovieRepository;
import com.example.BookMyShowProject.RequestDtos.AddMovieRequest;
import com.example.BookMyShowProject.Transformers.MovieTransformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public String addMovie(AddMovieRequest addMovieRequest) throws Exception{

        Movie movie = MovieTransformers.convertAddMovieReqToMovie(addMovieRequest);

        movieRepository.save(movie);

        return "Movie has been added to the DB successfully";

    }
}
