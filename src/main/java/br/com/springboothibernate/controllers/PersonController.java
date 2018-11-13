package br.com.springboothibernate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboothibernate.models.Person;
import br.com.springboothibernate.repositories.PersonRepository;

@RestController
@RequestMapping(produces=MediaType.APPLICATION_JSON_VALUE, value="/person")
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET, value="/getPersons")
	public List<Person> getPersons() {
		return personRepository.findAll();
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET, value="/getPersonsFiltered")
	public List<Person> getPersonsFiltered(String name) {
		return personRepository.findNameLike(name);
	}
}