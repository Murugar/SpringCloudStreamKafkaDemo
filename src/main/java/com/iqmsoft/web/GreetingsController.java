package com.iqmsoft.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iqmsoft.model.MsgGreeting;
import com.iqmsoft.service.GreetingsService;

@RestController
public class GreetingsController {
    private final GreetingsService greetingsService;

    public GreetingsController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    @GetMapping("/greetings")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void hello(@RequestParam("message") String message) {
        MsgGreeting greetings = new MsgGreeting(System.currentTimeMillis(), message);

        greetingsService.sendGreeting(greetings);
    }
}
