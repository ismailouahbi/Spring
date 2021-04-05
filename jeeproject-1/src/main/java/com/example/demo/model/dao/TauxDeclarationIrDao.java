package com.example.demo.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.TauxDeclarationIr;


@Repository
public interface TauxDeclarationIrDao extends JpaRepository<TauxDeclarationIr, Long> {
	
	
//	public List<TauxDeclarationIr>  findBySalaireBruteGreaterThan(double salaire);
	

}