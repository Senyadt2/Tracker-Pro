package com.example.trackerpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trackerpro.model.EmployeeModel;

public interface EmployeeRepo extends JpaRepository<EmployeeModel, Integer>{

}
