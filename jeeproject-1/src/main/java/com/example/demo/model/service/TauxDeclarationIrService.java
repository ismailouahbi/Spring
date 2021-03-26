package com.example.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.TauxDeclarationIr;
import com.example.demo.model.dao.TauxDeclarationIrDao;





@Service
public class TauxDeclarationIrService {

	public List<TauxDeclarationIr> findAll() {
		return tauxdeclarationirDao.findAll();
	}

	public List<TauxDeclarationIr> findBySalaireGreaterThan(double salaire) {
		return tauxdeclarationirDao.findBySalaireGreaterThan(salaire);
	}

	public int save(TauxDeclarationIr tauxdeclarationir) {
		if(tauxdeclarationir.getSalaireMin()<0) {
			return -1;
			
		}else if (tauxdeclarationir.getSalaireMin() > tauxdeclarationir.getSalaireMax()) {
			return -2;
			
		}else if(tauxdeclarationir.getPourcentage()<0) {
			return -3;
			
		}else {
			tauxdeclarationirDao.save(tauxdeclarationir);
			return 1;
		}
		
	}
	


public TauxDeclarationIr findBySalaire(double salaire) {
	 List<TauxDeclarationIr>  tauxDeclarationIrs= findAll();
	 
	 for (TauxDeclarationIr tauxDeclarationIr : tauxDeclarationIrs) {
		if(salaire >= tauxDeclarationIr.getSalaireMin() && salaire < tauxDeclarationIr.getSalaireMax() ) {
			
			return tauxDeclarationIr;
			}
		
	}
	 return null;
	
}
	
	
	
	@Autowired
	private TauxDeclarationIrDao tauxdeclarationirDao;

	
}

