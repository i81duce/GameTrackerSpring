package com.example;//Created by KevinBozic on 3/8/16.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GameTrackerController {
    @Autowired
    GameRepository games;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model, String genre, Integer releaseYear, String platform) {
        if (platform != null) {
            model.addAttribute("games", games.findByPlatformStartsWith(platform));
        }
        else if (genre != null && releaseYear != null) {
            model.addAttribute("games", games.findByGenreAndReleaseYearIsGreaterThanEqual(genre, releaseYear));
        }
        else if (genre != null) {
            model.addAttribute("games", games.findByGenre(genre));
        }
        else {
            model.addAttribute("games", games.findAll());
        }
        return "home";
    }

    @RequestMapping(path = "/addGame", method = RequestMethod.POST)
    public String addGame(String gameName, String gamePlatform, String gameGenre, int gameYear) { // matches html
        Game game = new Game(gameName, gamePlatform, gameGenre, gameYear);
        games.save(game);
        return "redirect:/";
    }

    // maybe add delete route later on
}
