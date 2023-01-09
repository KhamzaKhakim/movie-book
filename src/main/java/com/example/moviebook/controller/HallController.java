package com.example.moviebook.controller;

import com.example.moviebook.db.Hall;
import com.example.moviebook.db.HallRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HallController {

    private final HallRepository hallRepository;


    public HallController(HallRepository hallRepository) {
        this.hallRepository = hallRepository;
    }

    @PostMapping("/api/hall")
    public void addHall(@RequestBody Hall hall){

        hallRepository.save(hall);
    }

    @GetMapping("/api/hall")
    public List<Hall> showAllHall(){
        return hallRepository.findAll();
    }

    @GetMapping("api/hall/{id}")
    public Hall showHallById(@PathVariable String id) {
        return hallRepository.findHallById(id);
    }


    @DeleteMapping("api/hall/{id}")
    public void deleteHallById(@PathVariable String id){
        hallRepository.delete(hallRepository.findHallById(id));
    }
}
