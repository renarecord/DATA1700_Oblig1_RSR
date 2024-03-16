package com.example.oblig1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FilmRegController {

    List<Billett> billetter = new ArrayList<>();

    @PostMapping("/lagre")
    public List<Billett> lagre(Billett billett) {
        billetter.add(billett);
        return billetter;
    }

    @GetMapping("/slettAlle")
    public void slettAlle() {
        billetter.clear();
    }
}
