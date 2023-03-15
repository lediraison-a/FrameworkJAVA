package com.isen.test.repository.JPA;

import com.isen.test.entity.PersonneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepositoryJPA extends JpaRepository<PersonneEntity, String> {
}
