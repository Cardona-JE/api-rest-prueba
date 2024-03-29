package com.api.persona.Person;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping("/create")
    public void createPerson(@RequestBody Person person){
        personService.createPerson(person);
    }

    @GetMapping("/all")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public Optional<Person> getPersonbyId(@PathVariable Integer id){
        return personService.getPersonById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updatePerson(@PathVariable Integer id, @RequestBody Person updatedPerson) {
        personService.updatePerson(id, updatedPerson);
        return ResponseEntity.ok("Person updated successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePerson(@PathVariable Integer id) {
        personService.deletePerson(id);
        return ResponseEntity.ok("Person deleted successfully");
    }


}
