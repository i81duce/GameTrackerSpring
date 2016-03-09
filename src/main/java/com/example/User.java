package com.example;//Created by KevinBozic on 3/9/16.

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false, unique = true)
    String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }
}
