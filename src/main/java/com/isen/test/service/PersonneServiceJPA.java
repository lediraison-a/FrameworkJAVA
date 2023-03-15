package com.isen.test.service;

import com.isen.test.dto.PersonneDTO;
import com.isen.test.entity.PersonneEntity;
import com.isen.test.repository.JDBC.DataRepositoryJDBC;
import com.isen.test.repository.JDBC.DataRepositoryJDBCJDBCImpl;
import com.isen.test.repository.JPA.DataRepositoryJPA;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonneServiceJPA implements PersonneService {

    private final DataRepositoryJPA dataRepositoryJPA;

    public PersonneServiceJPA(DataRepositoryJPA dataRepositoryJPA) {
        this.dataRepositoryJPA = dataRepositoryJPA;
    }

    public List<PersonneDTO> listPersonne() {
        return dataRepositoryJPA.findAll().stream().map(PersonneDTO::new).collect(Collectors.toList());
    }

    public PersonneDTO getPersonne(String id) {
        return new PersonneDTO(dataRepositoryJPA.findById(id).get());
    }

    public void addPersonne(PersonneDTO personneDTO) {
        dataRepositoryJPA.save(new PersonneEntity(personneDTO));
    }

    public void updatePersonne(PersonneDTO personneDTO) {
        dataRepositoryJPA.save(new PersonneEntity(personneDTO));
    }
}
