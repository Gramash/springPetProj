package test.controller;

import test.hello.GreetingsBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/hello")
    public GreetingsBean greet(@RequestParam(value = "name", defaultValue = "World!") String name) {
        return new GreetingsBean(counter.incrementAndGet(),
                String.format(template, name));
    }

}
