package com.sirfransome.jpaprojections.repository;

import com.sirfransome.jpaprojections.entity.Person;
import com.sirfransome.jpaprojections.entity.PersonDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepo extends JpaRepository<Person, Long> {

    @Query(value = "SELECT p.FIRST_NAME AS firstName, p.LAST_NAME AS lastName, p.EMAIL AS email, p.STATUS AS status, " +
            "a.STREET AS street, a.CITY AS city " +
            "FROM PERSON p LEFT JOIN ADDRESS a ON p.ID = a.PERSON_ID " +
            "WHERE p.FIRST_NAME = :firstName", nativeQuery = true)
    List<PersonDTO> getPerson(@Param("firstName") String firstName);
}
