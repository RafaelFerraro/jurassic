package com.learning.jurassic.infra.repositories;

import com.learning.jurassic.infra.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employee, Long> {
}
