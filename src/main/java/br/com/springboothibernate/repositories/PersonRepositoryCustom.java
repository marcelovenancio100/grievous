package br.com.springboothibernate.repositories;

import java.util.List;

import br.com.springboothibernate.models.Person;

public interface PersonRepositoryCustom {

	public List<Person> findNameLike(String name);
}