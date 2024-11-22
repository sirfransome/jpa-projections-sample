package com.sirfransome.jpaprojections.service;

import com.sirfransome.jpaprojections.entity.PersonDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PersonService {
    List<PersonDTO> getPerson(String firstName);
}
