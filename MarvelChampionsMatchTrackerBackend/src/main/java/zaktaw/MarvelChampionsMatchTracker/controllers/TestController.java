package zaktaw.MarvelChampionsMatchTracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zaktaw.MarvelChampionsMatchTracker.services.TestService;

@RestController
@RequestMapping("/api")
public class TestController {

    private TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public String testGet() {
        System.out.println("Test get...");
        return testService.testGet();
    }
}
