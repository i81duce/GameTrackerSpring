package com.example;//Created by KevinBozic on 3/8/16.

import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Integer> { // creates special interface

}
