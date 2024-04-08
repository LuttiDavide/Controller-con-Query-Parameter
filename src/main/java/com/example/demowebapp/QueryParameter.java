package com.example.demowebapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/ciao")
public class QueryParameter {

    @GetMapping
    public String saluto(@RequestParam String nome, @RequestParam String provincia) {
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }
}
