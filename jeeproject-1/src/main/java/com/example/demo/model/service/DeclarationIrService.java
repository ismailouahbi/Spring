package com.example.demo.model.service;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.DeclarationIr;
import com.example.demo.model.dao.DeclarationIrDao;



@Service
public class DeclarationIrService {
	@Autowired
	private DeclarationIrDao declarationIrDao;


	public List<DeclarationIr> findByIceSociete(String ice) {
		return declarationIrDao.findByIceSociete(ice);
	}

	public DeclarationIr findByRefEmployee(String ref) {
		return declarationIrDao.findByRefEmployee(ref);
	}

	@Transactional
	public int deleteByRefEmployee(String ref) {
		return declarationIrDao.deleteByRefEmployee(ref);
	}

	public List<DeclarationIr> findByRefEmployeeLikeAndSalaireNetGreaterThan(String ref, double montant) {
		return declarationIrDao.findByRefEmployeeLikeAndSalaireNetGreaterThan(ref, montant);
	}

	public List<DeclarationIr> findByRefEmployeeLikeAndSalaireBruteGreaterThan(String ref, double montant) {
		return declarationIrDao.findByRefEmployeeLikeAndSalaireBruteGreaterThan(ref, montant);
	}

	

	public int save(DeclarationIr declaration) {
		if (findByRefEmployee(declaration.getRefEmployee()) != null) {
			return -1;
		} else if (declaration.getSalaireBrute() < declaration.getSalaireNet()) {
			return -2;
		} else {
			declarationIrDao.save(declaration);
			return 1;
		}
	}


	public List<DeclarationIr> findAll() {
		return declarationIrDao.findAll();
	}

	public DeclarationIr getOne(Long id) {
		return declarationIrDao.getOne(id);
	}

}