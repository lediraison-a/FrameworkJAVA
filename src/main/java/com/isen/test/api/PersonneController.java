package com.isen.test.api;

import com.isen.test.dto.PersonneDTO;
import com.isen.test.service.PersonneService;
import com.isen.test.service.PersonneServiceJPA;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
@RequestMapping("/personne")
public class PersonneController {

    private final PersonneService personneService;

    public PersonneController(PersonneServiceJPA personneService) {
        this.personneService = personneService;
    }

    @GetMapping()
    public ResponseEntity<List<PersonneDTO>> listPersonne() {
        return ResponseEntity.ok(personneService.listPersonne());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonneDTO> getPersonne(@PathVariable String id) {
        return ResponseEntity.ok(personneService.getPersonne(id));
    }

    @PutMapping()
    public ResponseEntity<Void> addPersonne(@RequestBody PersonneDTO personne) {
        personneService.addPersonne(personne);
        return ResponseEntity.ok().build();
    }

    @PostMapping()
    public ResponseEntity<Void> updatePersonne(@RequestBody PersonneDTO personne) {
        personneService.updatePersonne(personne);
        return ResponseEntity.ok().build();
    }
}
