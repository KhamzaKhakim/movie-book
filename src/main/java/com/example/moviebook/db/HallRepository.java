package com.example.moviebook.db;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepository extends MongoRepository<Hall, String> {
    @Query("{_id: '?0'}")
    Hall findHallById(String id);
}
