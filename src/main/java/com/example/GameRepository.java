package com.example;//Created by KevinBozic on 3/8/16.

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GameRepository extends CrudRepository<Game, Integer> { // creates special interface
    // adding query method
    List<Game> findByUser(User user);
    List<Game> findByUserAndGenre(User user, String genre);
    List<Game> findByUserAndGenreAndReleaseYear(User user, String genre, int releaseYear);
    List<Game> findByUserAndGenreAndReleaseYearIsGreaterThanEqual(User user, String genre, int minReleaseYear);

    Game findFirstByGenre(String genre);
    int countByGenre(String genre);
    List<Game> findByGenreOrderByNameAsc(String genre);

    @Query("SELECT g FROM Game g WHERE g.platform LIKE ?1%")
    List<Game> findByPlatformStartsWith(String platform);
}
