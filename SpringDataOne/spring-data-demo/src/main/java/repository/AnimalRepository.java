package repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import grandcircus.co.springdatademo.model.Animal;

public interface AnimalRepository extends 
	MongoRepository<Animal, String>{
	
	List<Animal> findAll();
	
	List<Animal> findAllGoodGuys(Boolean isGoodBoy);
	
	Optional<Animal> findById(String id);
	
	//Animal save(Animal entity);
	
}
