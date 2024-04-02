package com.example.trackerpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.trackerpro.model.EmployeeModel;
import com.example.trackerpro.model.ErrorResponse;
import com.example.trackerpro.model.ResponseMessage;
import com.example.trackerpro.repository.EmployeeRepo;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepo employeeRepo;
	
	
	@GetMapping("Employees")
	@ResponseBody
	public List<EmployeeModel> getEmployee(){
		List<EmployeeModel> employees = employeeRepo.findAll();
		return  employees;
	}
	
	@GetMapping("Employee/{e_id}")
	@ResponseBody
	public ResponseEntity<Object> getEmployee(@PathVariable int e_id) {
		EmployeeModel employeeModel =  employeeRepo.findById(e_id).orElse(null);
		if(employeeModel != null) {
			return ResponseEntity.ok(employeeModel);

		}
		else {
			String errorMessage = "Employee with ID " + e_id + " not found";
            ErrorResponse errorResponse = new ErrorResponse(errorMessage);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
	}
	
	@PostMapping("addEmployee")
	@ResponseBody
	public ResponseMessage  addEmp(EmployeeModel eModel) {
		employeeRepo.save(eModel);
		return new ResponseMessage("Inserted");
	}


}
