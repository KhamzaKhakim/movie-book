package com.example.moviebook.db;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("director")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Director {
    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String imgLink;
}
