package com.example.demo.model.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.bean.Employee;



@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {
	
   Employee findByRef(String ref);
   int  deleteByRef(String ref);
   List<Employee> findByRefLikeAndSalaireActuelGreaterThan(String ref, double salaireActuel);
   //Employee findByTypeContratCode(String code);
   //int deleteByTypeContratCode(String code);
}
