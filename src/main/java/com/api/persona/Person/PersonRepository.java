package com.api.persona.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//create the extension with Jpa, and gives methods to manipulate the tables with Jpa
public interface PersonRepository extends JpaRepository <Person, Integer>{

}
