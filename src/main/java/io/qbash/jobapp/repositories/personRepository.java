package io.qbash.jobapp.repositories;

import org.springframework.data.repository.CrudRepository;
import io.qbash.jobapp.domain.Person;

public interface personRepository extends CrudRepository<Person,Long>{
}
