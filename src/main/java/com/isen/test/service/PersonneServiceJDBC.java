package com.isen.test.service;

import com.isen.test.dto.PersonneDTO;
import com.isen.test.repository.JDBC.DataRepositoryJDBC;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonneServiceJDBC implements PersonneService {

    private final DataRepositoryJDBC dataRepositoryJDBC;

    public PersonneServiceJDBC(DataRepositoryJDBC dataRepositoryJDBC) {
        this.dataRepositoryJDBC = dataRepositoryJDBC;
    }

    public List<PersonneDTO> listPersonne() {
        return dataRepositoryJDBC.listPersonne();
    }

    public PersonneDTO getPersonne(String id) {
        return dataRepositoryJDBC.getPersonne(id);
    }

    public void addPersonne(PersonneDTO personneDTO) {
        dataRepositoryJDBC.addPersonne(personneDTO);
    }

    public void updatePersonne(PersonneDTO personneDTO) {
        dataRepositoryJDBC.updatePersonne(personneDTO);
    }
}
