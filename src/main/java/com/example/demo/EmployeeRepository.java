package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    ArrayList<Employee> findByFirstname(String firstname);
}
