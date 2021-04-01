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

import com.example.demo.bean.DeclarationIr;
import com.example.demo.model.service.DeclarationIrService;





@RestController
@RequestMapping("Fiscale/Declaration")
public class DeclarationIrWs {

	@Autowired
	private DeclarationIrService declarationIrService;
	
	@GetMapping("montant-greather-than/{montant}")
	public List<DeclarationIr> findByMontantIrSuperieur(double montant) {
		return declarationIrService.findByMontantIrSuperieur(montant);
	}

	@GetMapping("/mois/{mois}")
	public List<DeclarationIr> findByMoisLike(@PathVariable int mois) {
		return declarationIrService.findByMoisLike(mois);
	}

	@GetMapping("/annee/{annee}")
	public List<DeclarationIr> findByAnneeLike(@PathVariable int annee) {
		return declarationIrService.findByAnneeLike(annee);
	}

	@GetMapping("/ice/{ice}")
	public List<DeclarationIr> findByIceSociete(@PathVariable String ice) {
		return declarationIrService.findBySocieteIce(ice);
	}

	@DeleteMapping("/ref/{ref}")
	public int deleteByEmployeeRef(@PathVariable String ref) {
		return declarationIrService.deleteByRefEmployee(ref);
	}

	public boolean equals(Object obj) {
		return declarationIrService.equals(obj);
	}

	@GetMapping("/ref/{ref}")
	public DeclarationIr findByEmployeeRef(@PathVariable String ref) {
		return declarationIrService.findByRefEmployee(ref);
	}

	@GetMapping("/reference/{ref}/montant/{montant}")
	public List<DeclarationIr> findByEmployeeRefLikeAndSalaireNetGreaterThan(@PathVariable String ref,@PathVariable double montant) {
		return declarationIrService.findByEmployeeRefLikeAndSalaireNetGreaterThan(ref, montant);
	}

	@GetMapping("/ref/{ref}/montant/{montant}")
	public List<DeclarationIr> findByEmployeeRefLikeAndSalaireBruteGreaterThan(@PathVariable String ref,@PathVariable double montant) {
		return declarationIrService.findByEmployeeRefLikeAndSalaireBruteGreaterThan(ref, montant);
	}

	

	@PostMapping("/")
	public int save(@RequestBody DeclarationIr declaration) {
		return declarationIrService.save(declaration);
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