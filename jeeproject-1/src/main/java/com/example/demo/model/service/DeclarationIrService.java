package com.example.demo.model.service;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.DeclarationIr;
import com.example.demo.bean.Employee;
import com.example.demo.model.dao.DeclarationIrDao;



@Service
public class DeclarationIrService {
	@Autowired
	private DeclarationIrDao declarationIrDao;
    @Autowired
    private EmployeeService employeeService;

	public List<DeclarationIr> findByMontantIrSuperieur(double montant) {
		return declarationIrDao.findByMontantIrSuperieur(montant);
	}

	public List<DeclarationIr> findByMoisLike(int mois) {
		return declarationIrDao.findByMoisLike(mois);
	}

	public List<DeclarationIr> findByAnneeLike(int annee) {
		return declarationIrDao.findByAnneeLike(annee);
	}

	

	public List<DeclarationIr> findByEmployeeRefLikeAndSalaireNetGreaterThan(String ref, double montant) {
		return declarationIrDao.findByEmployeeRefLikeAndSalaireNetGreaterThan(ref, montant);
	}

	public List<DeclarationIr> findByEmployeeRefLikeAndSalaireBruteGreaterThan(String ref, double montant) {
		return declarationIrDao.findByEmployeeRefLikeAndSalaireBruteGreaterThan(ref, montant);
	}

	public List<DeclarationIr> findByEmployeeRefLikeAndMoisGreaterThan(String ref, int mois) {
		return declarationIrDao.findByEmployeeRefLikeAndMoisGreaterThan(ref, mois);
	}

	public List<DeclarationIr> findByEmployeeRefLikeAndAnneeGreaterThan(String ref, int annee) {
		return declarationIrDao.findByEmployeeRefLikeAndAnneeGreaterThan(ref, annee);
	}

	public List<DeclarationIr> findBySocieteIce(String ice) {
		return declarationIrDao.findBySocieteIce(ice);
	}

	public DeclarationIr findByRefEmployee(String ref) {
		return declarationIrDao.findByEmployeeRef(ref);
	}

	@Transactional
	public int deleteByRefEmployee(String ref) {
		return declarationIrDao.deleteByEmployeeRef(ref);
	}


	public void update(DeclarationIr declaration)
	{
		declarationIrDao.save(declaration);
	}

	public int save(DeclarationIr declaration) {
		Employee emp=employeeService.findByRef(declaration.getEmployee().getRef());
		if (emp==null) {
			return -1;
		} else if (declaration.getSalaireBrute() < declaration.getSalaireNet()) {
			return -2;
		} else {
			declaration.setEmployee(emp);
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