package com.learning.jurassic.application.controller;

import com.learning.jurassic.infra.entities.Employee;
import com.learning.jurassic.infra.repositories.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {

  @Autowired
  EmployeesRepository repository;

  @PostMapping("/employees")
  public Employee create() {
    return repository.save(new Employee("Rafael", "Software Engineer"));
  }
}
