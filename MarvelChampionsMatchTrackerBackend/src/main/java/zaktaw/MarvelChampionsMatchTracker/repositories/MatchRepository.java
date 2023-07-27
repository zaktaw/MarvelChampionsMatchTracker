package zaktaw.MarvelChampionsMatchTracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import zaktaw.MarvelChampionsMatchTracker.models.Match;

public interface MatchRepository extends JpaRepository<Match, Integer> {
}