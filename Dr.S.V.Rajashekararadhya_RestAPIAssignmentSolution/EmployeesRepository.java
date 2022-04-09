package com.greatlearning.repository;

import com.greatlearning.model.Employees;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.greatlearning.model.Employees;

import java.util.List;

@Repository


public interface EmployeesRepository extends JpaRepository<Employees, Integer>  
{  
 @Query("FROM Employees ORDER BY employeeid ASC")
    List<Employees> findAllOrderByemployeeidAsc();

    @Query("FROM Employees")
    List<Employees> findAllOrderByNameAsc(Sort sort);
}  
