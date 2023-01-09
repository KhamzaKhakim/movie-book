package com.example.moviebook.controller;

import com.example.moviebook.db.Movie;
import com.example.moviebook.db.Session;
import com.example.moviebook.db.SessionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SessionController{
    private final SessionRepository sessionRepository;

    public SessionController(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @PostMapping("/api/session")
    public void addSession(@RequestBody Session session){
        sessionRepository.save(session);
    }

    @GetMapping("/api/session")
    public List<Session> showAllSession(){
        return sessionRepository.findAll();
    }

    @GetMapping("api/session/{id}")
    public Session showSessionById(@PathVariable String id) {
        return sessionRepository.findSessionById(id);
    }


    @DeleteMapping("api/session/{id}")
    public void deleteSessionById(@PathVariable String id){
        sessionRepository.delete(sessionRepository.findSessionById(id));
    }
}
