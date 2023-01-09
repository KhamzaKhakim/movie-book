package com.example.moviebook.db;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("movie")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Movie {
    @Id
    String id;

    String name;
    String country;
    Integer year;
    Long ratingImdb;

    Long ratingOurUsers;

    String imgLink;

    String description;

    List<Actor> actorList;

    Director director;

    Integer lengthInMinutes;

    String language;

}
