package zaktaw.MarvelChampionsMatchTracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zaktaw.MarvelChampionsMatchTracker.models.Match;
import zaktaw.MarvelChampionsMatchTracker.services.MatchService;

import java.util.List;
@RestController
@RequestMapping("/api/match")
public class MatchController {
    @Autowired
    MatchService matchService;

    @GetMapping
    public List<Match> getAll() {
        return matchService.getAll();
    }

    @PostMapping
    public Match post(@RequestBody Match match) {
        return matchService.post(match);
    }

    @DeleteMapping("/{id}")
    public Match delete(@PathVariable Integer id) {
        return matchService.delete(id);
    }
}
