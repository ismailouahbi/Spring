package com.example.demo.model.ws;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean.Employee;
import com.example.demo.model.service.EmployeeService;

@RestController
@RequestMapping("ImpotSurRevenu/Employee")
public class EmployeeWs {
    
	@GetMapping("ref/{ref}")
    public Employee findByRef(@PathVariable String ref) {
		return employeService.findByRef(ref);
	}
    
	@DeleteMapping("ref/{ref}")
	public int deleteByRef(@PathVariable String ref) {
		return employeService.deleteByRef(ref);
	}

	@GetMapping("ref{ref}/salaireActuel{salaireActuel}")
	public List<Employee> findByRefLikeAndSalaireActuelGreaterThan(@PathVariable String ref,@PathVariable  double salaireActuel) {
		return employeService.findByRefLikeAndSalaireActuelGreaterThan(ref, salaireActuel);
	}
    
	@GetMapping("/")
	public List<Employee> findAll() {
		return employeService.findAll();
	}   

	@PostMapping("/")
	public int save(@RequestBody Employee employee) {
		return employeService.save(employee);
	}

	public String toString() {
		return employeService.toString();
	}

	@Autowired
    private EmployeeService employeService;
}
