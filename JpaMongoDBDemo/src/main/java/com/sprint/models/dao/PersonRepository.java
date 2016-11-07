package com.sprint.models.dao;

import java.util.List;
import com.sprint.models.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PersonRepository extends MongoRepository<Person, String> {
	Person findByName(String name);

	@Query("{'age': ?0}")
	List<Person> withQueryFindByAge(Integer age);
}
