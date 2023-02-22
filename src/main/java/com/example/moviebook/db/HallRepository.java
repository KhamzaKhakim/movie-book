package com.example.moviebook.db;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepository extends MongoRepository<Hall, String> {
    @org.springframework.data.mongodb.repository.Query("{_id: '?0'}")
    Hall findHallById(String id);

    default public void updateSeat(String user, String id, Integer row, Integer seat){

        Hall oldHall = findHallById(id);
        System.out.println(oldHall.getId());
        oldHall.getSeatList().get(row-1).get(seat-1).setAvailable(false);
        oldHall.getSeatList().get(row-1).get(seat-1).setUser(user);
        save(oldHall);

    }
}
