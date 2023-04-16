package zaktaw.MarvelChampionsMatchTracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import zaktaw.MarvelChampionsMatchTracker.models.Test;
import zaktaw.MarvelChampionsMatchTracker.services.TestService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    private TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public List<Test> testGet() {
        System.out.println("Test get...");
        return testService.testGet();
    }

    @PostMapping("/test")
    public Test testPost(@RequestBody Test test) {
        System.out.println("Test post...");
        return testService.testPost(test);
    }
}
