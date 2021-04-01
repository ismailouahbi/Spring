package com.example.demo.model.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.DeclarationIr;




@Repository
public interface DeclarationIrDao extends JpaRepository<DeclarationIr,Long>{
	
	DeclarationIr findByEmployeeRef(String ref);
	int deleteByEmployeeRef(String ref);
	List<DeclarationIr> findByEmployeeRefLikeAndSalaireNetGreaterThan(String ref,double montant);
	List<DeclarationIr> findByEmployeeRefLikeAndSalaireBruteGreaterThan(String ref,double montant);
	List<DeclarationIr> findByEmployeeRefLikeAndMoisGreaterThan(String ref,int mois);
	List<DeclarationIr> findByEmployeeRefLikeAndAnneeGreaterThan(String ref,int annee);
	List<DeclarationIr> findBySocieteIce(String ice);
	
	List<DeclarationIr> findByMoisLike(int mois);
	List<DeclarationIr> findByAnneeLike(int annee);
	@Query("select d from DeclarationIr d where d.montantIr>=:montant")
	List<DeclarationIr> findByMontantIrSuperieur(@Param("montant") double montant);
	
	
	
	
	//rechercher la declaration la plus récente
	//en utilisant @Query
	
	

}