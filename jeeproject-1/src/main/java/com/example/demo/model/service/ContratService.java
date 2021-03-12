package com.example.demo.model.service;


import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.bean.Contrat;
import com.example.demo.bean.Employee;
import com.example.demo.bean.TypeContrat;
import com.example.demo.model.dao.ContratDao;


@Service
public class ContratService {
	
	public int save(Contrat contrat) {
		
		Employee employee = employeeService.findByRef(contrat.getEmployee().getRef());
		contrat.setEmployee(employee);
		TypeContrat typeContrat = typeContratService.findByCode(contrat.getTypeContrat().getCode());
		contrat.setTypeContrat(typeContrat);
		
		if(employee == null || typeContrat == null) {
			return -1;
		}
		else if(contrat.getDateResiliation().before(contrat.getDateDemarage())) {
			return -2;
		}
		else {
			contratDao.save(contrat);
		    return 1;
		}
	}
	
	public Contrat findByEmployeeRef(String ref) {
		return contratDao.findByEmployeeRef(ref);
	}
	@Transactional
	public int deleteByEmployeeRef(String ref) {
		return contratDao.deleteByEmployeeRef(ref);
	}
    //prbleme
	public List<Contrat> findByEmployeeSalaireActuelGreaterThan(double salaireActuel) {
		return contratDao.findByEmployeeSalaireActuelGreaterThan(salaireActuel);
	}
    //problem
	public Contrat findByTypeContratCode(String code) {
		return contratDao.findByTypeContratCode(code);
	}
	@Transactional
	public int deleteByTypeContratCode(String code) {
		return contratDao.deleteByTypeContratCode(code);
	}

	public List<Contrat> findAll() {
		return contratDao.findAll();
	}
    
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private TypeContratService typeContratService;
	
	@Autowired
	private ContratDao contratDao;
	
}
