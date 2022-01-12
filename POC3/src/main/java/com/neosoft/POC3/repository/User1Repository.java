package com.neosoft.POC3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//repository that extends CrudRepository
import org.springframework.data.repository.query.Param;

import com.neosoft.POC3.model.User1;


public interface User1Repository extends JpaRepository<User1, Integer>
{
	public List<User1> findByUserFirstNameOrSurNameOrPinCode(@Param("userFirstName") String firstName, @Param("surName") String surname,@Param("pinCode") String pinCode);


    
}