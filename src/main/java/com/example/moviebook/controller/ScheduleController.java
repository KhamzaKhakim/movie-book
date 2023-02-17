package com.example.moviebook.controller;

import com.example.moviebook.db.Movie;
import com.example.moviebook.db.Schedule;
import com.example.moviebook.db.ScheduleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScheduleController {
    private final ScheduleRepository scheduleRepository;

    public ScheduleController(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @PostMapping("api/admin/schedule")
    public void addSchedule(@RequestBody Schedule schedule){
        scheduleRepository.save(schedule);
    }


    @GetMapping("api/schedule")
    public List<Schedule> showAllSchedule(){
        return scheduleRepository.findAll();
    }

    @GetMapping("api/schedule/{id}")
    public Schedule showScheduleById(@PathVariable String id) {
        return scheduleRepository.findScheduleById(id);
    }


    @DeleteMapping("api/admin/schedule/{id}")
    public void deleteMovieById(@PathVariable String id){
        scheduleRepository.delete(scheduleRepository.findScheduleById(id));
    }
}
