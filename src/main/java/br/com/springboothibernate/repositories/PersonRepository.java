package br.com.springboothibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springboothibernate.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>, PersonRepositoryCustom {}