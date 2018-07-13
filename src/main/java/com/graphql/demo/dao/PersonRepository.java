package com.graphql.demo.dao;

import com.graphql.demo.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
    Person findByMail(String mail);
}
