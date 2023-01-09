package com.example.moviebook.db;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("hall")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Hall {
    @Id
    private String id;
    private Integer Capacity;
    List<List<Seat>> seatList;
}
