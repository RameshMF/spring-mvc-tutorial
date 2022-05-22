package net.springboot.javaguides.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.springboot.javaguides.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	 // spring data jpa provides full crud operations for Customer entity
}
