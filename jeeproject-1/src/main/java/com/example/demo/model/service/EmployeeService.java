package com.example.demo.model.service;


import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.bean.Employee;
import com.example.demo.model.dao.EmployeeDao;



@Service
public class EmployeeService {
	
	public Employee findByRef(String ref) {
		return employeeDao.findByRef(ref);
	}

//	public Employee findByTypeContratCode(String code) {
//		return employeeDao.findByTypeContratCode(code);
//	}

//	public int deleteByTypeContratCode(String code) {
//		return employeeDao.deleteByTypeContratCode(code);
//	}

	@Transactional
	public int deleteByRef(String ref) {
		return employeeDao.deleteByRef(ref);
	}

	public List<Employee> findByRefLikeAndSalaireActuelGreaterThan(String ref, double salaireActuel) {
		return employeeDao.findByRefLikeAndSalaireActuelGreaterThan(ref, salaireActuel);
	}

	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

	public int  save(Employee employee) {
		if(findByRef(employee.getRef())!=null) {	
			return -1;
		}else {
			employeeDao.save(employee);
			return 1;
		}
	}
	
	public Employee getOne(Long id) {
		return employeeDao.getOne(id);
	}
	
	@Autowired
	private EmployeeDao employeeDao;
}