package com.example.demo.model.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.DeclarationIr;




@Repository
public interface DeclarationIrDao extends JpaRepository<DeclarationIr,Long>{
	
	DeclarationIr findByRefEmployee(String ref);
	int deleteByRefEmployee(String ref);
	List<DeclarationIr> findByRefEmployeeLikeAndSalaireNetGreaterThan(String ref,double montant);
	List<DeclarationIr> findByRefEmployeeLikeAndSalaireBruteGreaterThan(String ref,double montant);
	List<DeclarationIr> findByRefEmployeeLikeAndMoisGreaterThan(String ref,int mois);
	List<DeclarationIr> findByRefEmployeeLikeAndAnneeGreaterThan(String ref,int annee);
	List<DeclarationIr> findByIceSociete(String ice);
	
	
	//rechercher la declaration la plus récente
	//en utilisant @Query
	
	

}