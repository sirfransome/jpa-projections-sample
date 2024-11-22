package com.sirfransome.jpaprojections.controller;

import com.sirfransome.jpaprojections.entity.PersonDTO;
import com.sirfransome.jpaprojections.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Api {

    private final PersonService personService;

    public Api(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/api/persons")
    public ResponseEntity<List<PersonDTO>> getPersons(@RequestParam("firstname") String firstName) {
        return ResponseEntity.ok(personService.getPerson(firstName));
    }
}
