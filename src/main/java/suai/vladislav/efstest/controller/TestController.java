package suai.vladislav.efstest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import suai.vladislav.efstest.dto.TestDto;

@RestController
@RequiredArgsConstructor
public class TestController {

    @GetMapping()
    public TestDto test() {
        return new TestDto(1, "test", "desc");
    }
}
