package com.example;//Created by KevinBozic on 3/8/16.

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Game {
    @Id // makes it a primary key
    @GeneratedValue // allows it to auto increment
    int id;

    String name;
    String platform;
    int releaseYear;

    public Game(String name, String platform, int releaseYear) {
        this.name = name;
        this.platform = platform;
        this.releaseYear = releaseYear;
    }

    public Game() {
    }
}
