package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Trainer;

/**
 * @author Sai Karthik Malyala
 *
 */
public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

}
