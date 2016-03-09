package com.example;//Created by KevinBozic on 3/9/16.

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findFirstByName(String userName);
}
