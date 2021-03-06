package com.greatlearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.model.Employees;
import com.greatlearning.service.EmployeesService;

@RestController
public class EmployeesController {
	//autowire the EmployeesService class  
	@Autowired  
	EmployeesService employeesService;  
	//creating a get mapping that retrieves all the employees detail from the database   
	@GetMapping("/employees")  
	private List<Employees> getAllEmployees()   
	{  
	return employeesService.getAllEmployees();  
	}  
	//creating a get mapping that retrieves the detail of a specific employee  
	@GetMapping("/employees/{employeeid}")  
	private Employees getEmployees(@PathVariable("employeeid") int employeeid)   
	{  
	return employeesService.getEmployeesById(employeeid);  
	}  
	//creating a delete mapping that deletes a specified employee 
	@DeleteMapping("/employees/{employeeid}")  
	private void deleteEmployee(@PathVariable("employeeid") int employeeid)   
	{  
		employeesService.delete(employeeid);  
	}  
	//creating post mapping that post the employee detail in the database  
	@PostMapping("/employees")  
	private int saveEmployee(@RequestBody Employees employees)   
	{  
		employeesService.saveOrUpdate(employees);  
	return employees.getEmployeeid();  
	}  
	//creating put mapping that updates the employee detail   
	@PutMapping("/employees")  
	private Employees update(@RequestBody Employees employees)   
	{  
	employeesService.saveOrUpdate(employees);  
	return employees;  
	}  

	//@GetMapping("/employees")
   // public List<Employees> getEmployeesByemployeeid() {

        //return employeesService.findAllOrderByemployeeidAsc();
    //}

}
