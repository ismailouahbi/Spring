package com.example.demo.model.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.bean.TauxDeclarationIr;
import com.example.demo.model.service.TauxDeclarationIrService;



@RestController
@RequestMapping("tauxdeclarationirapi/tauxdeclarationir")
public class TauxDeclarationIrProvided {
	

	@GetMapping("/")
	public List<TauxDeclarationIr> findAll() {
		return tauxdeclarationirService.findAll();
	}

	
//	@GetMapping("/salaire/{salaire}")
//	public List<TauxDeclarationIr> findByDeclarationIrSalaireBruteGreaterThan(@PathVariable double salaire) {
//		return tauxdeclarationirService.findBySalaireBruteGreaterThan(salaire);
//	}



	@GetMapping("/getSalaireNet/{salaireBrut}")
	public TauxDeclarationIr getSalaireNet(@PathVariable Double salaireBrut) {
		return tauxdeclarationirService.getSalaireNet(salaireBrut);
	}




	@PostMapping("/")
	public double save(@RequestBody TauxDeclarationIr tauxdeclarationir) {
		return tauxdeclarationirService.save(tauxdeclarationir);
	}


	@Autowired
	private TauxDeclarationIrService tauxdeclarationirService;
	
}

