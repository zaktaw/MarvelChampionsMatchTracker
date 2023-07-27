package zaktaw.MarvelChampionsMatchTracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zaktaw.MarvelChampionsMatchTracker.models.Match;
import zaktaw.MarvelChampionsMatchTracker.repositories.MatchRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MatchService {

    @Autowired
    MatchRepository matchRepository;

    public List<Match> getAll() {
        return matchRepository.findAll();
    }

    public Match post(Match match) {
        return matchRepository.save(match);
    }

    public Match delete(Integer id) {
        Optional<Match> matchToDelete = matchRepository.findById(id);
        if (matchToDelete.isPresent()) {
            matchRepository.delete(matchToDelete.get());
            return matchToDelete.get();
        }
        return null;
    }
}
