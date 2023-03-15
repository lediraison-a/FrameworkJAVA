package com.isen.test.repository.JDBC;

import com.isen.test.dto.PersonneDTO;
import com.isen.test.mapper.PersonneRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataRepositoryJDBCImpl implements DataRepositoryJDBC {
    private final JdbcTemplate jdbcTemplate;

    public DataRepositoryJDBCImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<PersonneDTO> listPersonne() {
        var query = "SELECT * from personne";
        return this.jdbcTemplate.query(query, new PersonneRowMapper());
    }

    public PersonneDTO getPersonne(String id) {
        var query = "SELECT * from personne WHERE identifiant = ?";
        return this.jdbcTemplate.queryForObject(query, new PersonneRowMapper(), id);
    }

    public void addPersonne(PersonneDTO personneDTO) {
        var query = "INSERT INTO personne VALUES(?, ?, ?)";
        this.jdbcTemplate.update(
                query,
                personneDTO.getId(),
                personneDTO.getNom(),
                personneDTO.getPrenom());
    }

    public void updatePersonne(PersonneDTO personneDTO) {
        var query = "UPDATE personne SET nom = ?, prenom = ? WHERE identifiant = ?";
        this.jdbcTemplate.update(
                query,
                personneDTO.getNom(),
                personneDTO.getPrenom(),
                personneDTO.getId()
        );
    }

}
