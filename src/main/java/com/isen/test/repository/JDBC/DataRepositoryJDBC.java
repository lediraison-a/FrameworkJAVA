package com.isen.test.repository.JDBC;

import com.isen.test.dto.PersonneDTO;

import java.util.List;

public interface DataRepositoryJDBC {
    public List<PersonneDTO> listPersonne();

    public PersonneDTO getPersonne(String id);

    public void addPersonne(PersonneDTO personneDTO);

    public void updatePersonne(PersonneDTO personneDTO);
}
