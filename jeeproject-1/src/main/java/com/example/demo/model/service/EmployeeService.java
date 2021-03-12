package com.example.demo.model.service;


import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.bean.Employee;
import com.example.demo.model.dao.EmployeeDao;


@Service
public class EmployeeService {
	
	public int  save(Employee employee) {
		if(findByRef(employee.getRef())!=null) {	
			return -1;
		}else {
			employeeDao.save(employee);
			return 1;
		}
	}
	
	public Employee findByRef(String ref) {
		return employeeDao.findByRef(ref);
	}

	@Transactional
	public int deleteByRef(String ref) {
		int deletecontrat = contratService.deleteByTypeContratCode(ref);
		int deleteemployee = employeeDao.deleteByRef(ref);
		return deletecontrat+deleteemployee;
	}

	public List<Employee> findByRefLikeAndSalaireActuelGreaterThan(String ref, double salaireActuel) {
		return employeeDao.findByRefLikeAndSalaireActuelGreaterThan(ref, salaireActuel);
	}

	public List<Employee> findAll() {
		return employeeDao.findAll();
	}
	
	public Employee getOne(Long id) {
		return employeeDao.getOne(id);
	}
	
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private ContratService contratService;
}
