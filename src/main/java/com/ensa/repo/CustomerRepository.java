package com.ensa.repo;



import org.springframework.data.repository.CrudRepository;


import com.ensa.entity.Customer;
 
public interface CustomerRepository extends CrudRepository<Customer, Long> {
     
}