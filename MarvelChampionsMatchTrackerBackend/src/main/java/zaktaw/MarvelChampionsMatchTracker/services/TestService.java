package zaktaw.MarvelChampionsMatchTracker.services;

import org.springframework.stereotype.Service;
import zaktaw.MarvelChampionsMatchTracker.models.Test;
import zaktaw.MarvelChampionsMatchTracker.repositories.TestRepository;

import java.util.List;

@Service
public class TestService {

    private TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public List<Test> testGet() {
        return testRepository.findAll();
    }

    public Test testPost(Test test) {
        return testRepository.save(test);
    }
}
