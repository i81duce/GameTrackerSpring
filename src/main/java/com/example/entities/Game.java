package com.example.entities;//Created by KevinBozic on 3/8/16.

import javax.persistence.*;

@Entity
public class Game {
    @Id // makes it a primary key
    @GeneratedValue // allows it to auto increment
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String platform;

    @Column(nullable = false)
    String genre;

    int releaseYear;

    @ManyToOne
    User user;

    public Game(String name, String platform, String genre, int releaseYear, User user) {
        this.name = name;
        this.platform = platform;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.user = user;
    }

    public Game() {
    }
}
