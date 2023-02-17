package com.example.moviebook.db;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("seat")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Seat {
    @Id
    private String id;
    private Integer number;
    private Integer row;
    private Boolean available;

    private String user;

}
