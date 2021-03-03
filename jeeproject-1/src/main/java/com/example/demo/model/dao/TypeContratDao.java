package com.example.demo.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.bean.TypeContrat;


@Repository
public interface TypeContratDao extends JpaRepository<TypeContrat, Long> {
	
	TypeContrat findByCode(String code);
	
	int deleteByCode(String code);
}
