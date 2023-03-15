package com.isen.test.mapper;

import com.isen.test.dto.PersonneDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonneRowMapper implements RowMapper<PersonneDTO> {
    public PersonneDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new PersonneDTO(rs.getString(1), rs.getString(2), rs.getString(3));
    }
}