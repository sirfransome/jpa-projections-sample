package com.sirfransome.jpaprojections.service.impl;

import com.sirfransome.jpaprojections.entity.PersonDTO;
import com.sirfransome.jpaprojections.repository.PersonRepo;
import com.sirfransome.jpaprojections.service.PersonService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepo personRepo;

    public PersonServiceImpl(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public List<PersonDTO> getPerson(String firstName) {
        return personRepo.getPerson(firstName);
    }
}
