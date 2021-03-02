package com.example.demo.model.ws;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.DeclarationIr;
import com.example.demo.model.service.DeclarationIrService;





@RestController
@RequestMapping("Fiscale/Declaration")
public class DeclarationIrWs {

	@Autowired
	private DeclarationIrService declarationIrService;

	@DeleteMapping("/ref/{ref}")
	public int deleteByRefEmployee(@PathVariable String ref) {
		return declarationIrService.deleteByRefEmployee(ref);
	}

	public boolean equals(Object obj) {
		return declarationIrService.equals(obj);
	}

	@GetMapping("/ref/{ref}")
	public DeclarationIr findByRefEmployee(@PathVariable String ref) {
		return declarationIrService.findByRefEmployee(ref);
	}

	@GetMapping("/reference/{ref}/montant/{montant}")
	public List<DeclarationIr> findByRefEmployeeLikeAndSalaireNetGreaterThan(String ref, double montant) {
		return declarationIrService.findByRefEmployeeLikeAndSalaireNetGreaterThan(ref, montant);
	}

	@GetMapping("/ref/{ref}/montant/{montant}")
	public List<DeclarationIr> findByRefEmployeeLikeAndSalaireBruteGreaterThan(String ref, double montant) {
		return declarationIrService.findByRefEmployeeLikeAndSalaireBruteGreaterThan(ref, montant);
	}

	

	@PostMapping("/")
	public int save(@RequestBody DeclarationIr declaration) {
		return declarationIrService.save(declaration);
	}

	 @PutMapping("/payer/ref/{ref}/montant/{montant}")
	public int payer(@PathVariable String ref,@PathVariable double montant) {
		return declarationIrService.payer(ref, montant);
	}

	@GetMapping("/")
	public List<DeclarationIr> findAll() {
		return declarationIrService.findAll();
	}

	@GetMapping("/id/{id}")
	public DeclarationIr getOne(@PathVariable Long id) {
		return declarationIrService.getOne(id);
	}

	public int hashCode() {
		return declarationIrService.hashCode();
	}

	public String toString() {
		return declarationIrService.toString();
	}
	
	
	
	
}