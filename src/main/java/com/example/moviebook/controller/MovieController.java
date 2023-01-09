package com.example.moviebook.controller;

import com.example.moviebook.db.Hall;
import com.example.moviebook.db.Movie;
import com.example.moviebook.db.MovieRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @PostMapping("/api/movie")
    @Transactional
    public void addMovie(@RequestBody Movie movie){
        movieRepository.save(movie);
    }

    @GetMapping("/api/movie")
    @Transactional
    public List<Movie> showAllMovie(){
        return movieRepository.findAll();
    }

    @GetMapping("api/movie/{id}")
    public Movie showMovieById(@PathVariable String id) {
        return movieRepository.findMovieById(id);
    }


    @DeleteMapping("api/movie/{id}")
    public void deleteMovieById(@PathVariable String id){
        movieRepository.delete(movieRepository.findMovieById(id));
    }
}
