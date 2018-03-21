package pl.kmo2008.phonebookmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.kmo2008.phonebookmongodb.model.Person;

import java.util.stream.Stream;

@Repository
public interface PersonRepository extends MongoRepository<Person,String>{

    Stream<Person> findPersonByNameEquals(String name);
    Stream<Person> findByNameContainsOrderByNameAsc(String name);
    void deleteByNameEquals(String name);
}
