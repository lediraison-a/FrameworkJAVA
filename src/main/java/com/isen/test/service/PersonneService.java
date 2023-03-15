package com.isen.test.service;

import com.isen.test.dto.PersonneDTO;
import com.isen.test.repository.JDBC.DataRepositoryJDBC;

import java.util.List;

public interface PersonneService {

    public List<PersonneDTO> listPersonne();
    public PersonneDTO getPersonne(String id);
    public void addPersonne(PersonneDTO personneDTO);
    public void updatePersonne(PersonneDTO personneDTO);
}
