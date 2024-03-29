package com.api.persona.Person;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepo;

    public void createPerson(Person person){
        personRepo.save(person);
    }
    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }
    public Optional<Person> getPersonById(Integer id) {
        return personRepo.findById(id);
    }
    
    public void updatePerson(Integer id, Person updatedPerson) {
        Optional<Person> existingPersonOptional = personRepo.findById(id);
        if (existingPersonOptional.isPresent()) {
            Person existingPerson = existingPersonOptional.get();
            existingPerson.setFirstname(updatedPerson.getFirstname());
            existingPerson.setLastname(updatedPerson.getLastname());
            existingPerson.setEmail(updatedPerson.getEmail());
            personRepo.save(existingPerson);
        }
    }

    public void deletePerson(Integer id) {
        personRepo.deleteById(id);
    }

}
