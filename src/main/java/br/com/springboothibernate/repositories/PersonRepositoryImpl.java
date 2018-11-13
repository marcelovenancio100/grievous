package br.com.springboothibernate.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.springboothibernate.models.Person;

@Repository
@Transactional(readOnly = true)
public class PersonRepositoryImpl implements PersonRepositoryCustom {

	@PersistenceContext
    EntityManager entityManager;
	
	@Override
    public List<Person> findNameLike(String name) {
        Query query = entityManager.createNativeQuery("", Person.class);
        query.setParameter(1, name + "%");
        return query.getResultList();
    }
}