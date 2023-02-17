package com.example.moviebook.controller;

import com.example.moviebook.config.JwtService;
import com.example.moviebook.db.Hall;
import com.example.moviebook.db.HallRepository;
import com.example.moviebook.db.Seat;
import com.example.moviebook.db.Session;
import com.example.moviebook.db.SessionRepository;
import java.util.List;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController{
    private final SessionRepository sessionRepository;
    private final HallRepository hallRepository;

    public SessionController(SessionRepository sessionRepository,
                             HallRepository hallRepository) {
        this.sessionRepository = sessionRepository;
        this.hallRepository = hallRepository;
    }

    @PostMapping("api/admin/session")
    public void addSession(@RequestBody Session session){
        sessionRepository.save(session);
    }

    @GetMapping("api/session")
    public List<Session> showAllSession(){
        return sessionRepository.findAll();
    }

    @GetMapping("api/session/{id}")
    public Session showSessionById(@PathVariable String id) {
        return sessionRepository.findSessionById(id);
    }


    @DeleteMapping("api/admin/session/{id}")
    public void deleteSessionById(@PathVariable String id){
        sessionRepository.delete(sessionRepository.findSessionById(id));
    }

    @GetMapping ("api/tickets/book/{session}/{row}/{seat}")
    public void bookSeat(Authentication authentication, @PathVariable String session,
                         @PathVariable Integer row, @PathVariable Integer seat){
        System.out.println(session);
        Session sessionObj = sessionRepository.findSessionById(session);
        hallRepository.updateSeat(authentication.getName(), sessionObj.getHall(), row, seat);
    }
}
