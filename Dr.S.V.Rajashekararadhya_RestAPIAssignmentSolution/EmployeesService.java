package com.greatlearning.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.controller.EmployeesController;
import com.greatlearning.model.Employees;
import com.greatlearning.repository.EmployeesRepository;

@Service
public class EmployeesService {
		@Autowired  
		EmployeesRepository employeesRepository;  
		//getting all employees record by using the method findaAll()  
		public List<Employees> getAllEmployees()   
		{  
		List<Employees> employees = new ArrayList<Employees>();  
		employeesRepository.findAll().forEach(employees1 -> employees.add(employees1));  
		return employees;  
		}  
		//getting a specific record by using the method findById()   
		public Employees getEmployeesById(int id)   
		{  
		return employeesRepository.findById(id).get();  
		}  
		//saving a specific record by using the method save()   
		public void saveOrUpdate(Employees employees)   
		{  
			employeesRepository.save(employees);  
		}  
		//deleting a specific record by using the method deleteById()  
		public void delete(int id)   
		{  
			employeesRepository.deleteById(id);  
		}  
		//updating a record  
		public void update(Employees employees, int employeeid)   
		{  
			employeesRepository.save(employees);  
		}
		public List<Employees> findAllOrderByemployeeidAsc() {
			// TODO Auto-generated method stub
			return null;
		}  


}
