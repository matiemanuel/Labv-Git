package com.utn.spring.controller;

import com.utn.spring.model.Person;
import com.utn.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController (PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/")
    public List<Person> getAllPersons(){
        return this.personService.getAllPersons();
    }

    @PostMapping("/")
    public void addPerson(@RequestBody Person newPerson){
        this.personService.addPerson(newPerson);
    }

}
