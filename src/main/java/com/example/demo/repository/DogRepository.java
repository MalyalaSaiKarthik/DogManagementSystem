package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Dog;

/**
 * @author Sai Karthik Malyala
 *
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {

	List<Dog> findByName(String name);
}
