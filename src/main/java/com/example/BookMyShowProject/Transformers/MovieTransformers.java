package com.example.BookMyShowProject.Transformers;

import com.example.BookMyShowProject.Models.Movie;
import com.example.BookMyShowProject.RepositoryLayer.MovieRepository;
import com.example.BookMyShowProject.RequestDtos.AddMovieRequest;

public class MovieTransformers {

    public static Movie convertAddMovieReqToMovie(AddMovieRequest addMovieRequest){

        Movie movie = Movie.builder().
                movieName(addMovieRequest.getMovieName())
                .genre(addMovieRequest.getGenre())
                .releaseDate(addMovieRequest.getReleaseDate())
                .rating(addMovieRequest.getRating())
                .build();

        return movie;
    }
}
