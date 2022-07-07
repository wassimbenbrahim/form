package com.project.cft.repo;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.cft.entities.inscription;
@Repository


public interface inscridao extends CrudRepository<inscription, Long> {

	
	@Query(
			  value = "SELECT * FROM inscription u WHERE u.status = 1", 
			  nativeQuery = true)
	Collection<inscription> findAllacceptedstudent();


@Query(
		  value = "SELECT * FROM inscription u WHERE u.status = 0", 
		  nativeQuery = true)
Collection<inscription> listeattente();
}