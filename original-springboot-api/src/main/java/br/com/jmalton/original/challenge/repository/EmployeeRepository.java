package br.com.jmalton.original.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jmalton.original.challenge.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
