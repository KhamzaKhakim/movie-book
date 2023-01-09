package com.example.moviebook.db;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ScheduleRepository extends MongoRepository<Schedule, String> {
    @Query("{_id: '?0'}")
    Schedule findScheduleById(String id);
}
