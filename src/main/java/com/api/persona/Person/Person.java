package com.api.persona.Person;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Define the entity 
@Data //Using lombok create the getter and setter
@AllArgsConstructor //generate the constructors with all parameters
@NoArgsConstructor //the constructor doesn't receive parameters
public class Person {
    @Id 
    @GeneratedValue
    private Integer id; 
    @Basic
    private String firstname;
    private String lastname;
    private String email;

}
