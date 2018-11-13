package br.com.springboothibernate.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboothibernate.models.Person;

@RestController
@RequestMapping(produces=MediaType.APPLICATION_JSON_VALUE, value="/person")
public class PersonController {
	private Logger logger;
	
	public PersonController() {
		logger = Logger.getLogger(Person.class);
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET, value="/getPersons")
	public List<Person> getPersons() {
		logger.info("Getting persons on rest server");
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1L, "Marcelo Venancio", "marcelo_venancio@hotmail.com", 36));
		persons.add(new Person(2L, "Pedro Henrique Venancio", "pedro@uol.com.br", 6));
		persons.add(new Person(3L, "Lucas Henrique Venancio", "lucas@uol.com.br", 4));
		persons.add(new Person(4L, "Michael Jackson Venancio", "mj@terra.com.br", 56));
		persons.add(new Person(5L, "Chuck Norris Venancio", "chuck@bol.com.br", 72));
		return persons;
	}
}