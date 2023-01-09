package com.example.moviebook.db;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface MovieRepository extends MongoRepository<Movie, String> {
    @Query("{_id: '?0'}")
    Movie findMovieById(String id);
}
