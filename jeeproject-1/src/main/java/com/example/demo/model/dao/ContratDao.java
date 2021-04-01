package com.example.demo.model.dao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.bean.Contrat;

@Repository
public interface ContratDao extends JpaRepository<Contrat, Long>{
    
	Contrat findByEmployeeRef(String ref);
	
	int deleteByEmployeeRef(String ref);
	
	List<Contrat> findByEmployeeSalaireActuelGreaterThan(double salaireActuel);
	
	Contrat findByTypeContratCode(String code);
	
	int deleteByTypeContratCode(String code);
	
	Contrat findBySocieteIce(String ice);
	
	int deleteBySocieteIce(String ice);
}
