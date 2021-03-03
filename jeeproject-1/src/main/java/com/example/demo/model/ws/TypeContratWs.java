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
import com.example.demo.bean.TypeContrat;
import com.example.demo.model.service.TypeContratService;


@RestController
@RequestMapping(value = "ImpotSurRevenu/TypeContrat")
public class TypeContratWs {
	
	
	@PostMapping("/")
	public int save(@RequestBody TypeContrat typeContrat) {
		return typeContratService.save(typeContrat);
	}
	@GetMapping("code/{code}")
	public TypeContrat findByCode(@PathVariable String code) {
		return typeContratService.findByCode(code);
	}
	@DeleteMapping("code/{code}")
	public int deleteByCode(@PathVariable String code) {
		return typeContratService.deleteByCode(code);
	}
	@GetMapping("/")
	public List<TypeContrat> findAll() {
		return typeContratService.findAll();
	}

	@Autowired
	private TypeContratService typeContratService;
}
