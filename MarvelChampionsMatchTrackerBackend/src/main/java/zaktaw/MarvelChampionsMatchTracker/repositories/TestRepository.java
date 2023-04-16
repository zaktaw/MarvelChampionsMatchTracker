package zaktaw.MarvelChampionsMatchTracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import zaktaw.MarvelChampionsMatchTracker.models.Test;

public interface TestRepository extends JpaRepository<Test, Integer> {
}
