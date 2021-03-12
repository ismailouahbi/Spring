package com.example.demo.model.service;


import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.bean.TypeContrat;
import com.example.demo.model.dao.TypeContratDao;


@Service
public class TypeContratService {
	
	public void update(TypeContrat typeContrat) {
		typeContratDao.save(typeContrat);
	}
	
    public int save(TypeContrat typeContrat) {
    	if(findByCode(typeContrat.getCode())!=null) {
    		return -1;
    	}
    	else {
    		typeContratDao.save(typeContrat);
    		return 1;
    	}
    }
    
	public TypeContrat findByCode(String code) {
		return typeContratDao.findByCode(code);
	}
	
	public List<TypeContrat> findAll() {
		return typeContratDao.findAll();
	}
	
	
	@Transactional
	public int deleteByCode(String code) {
		int deleteContrat = contratService.deleteByTypeContratCode(code);
		int deleteTypeContrat =  typeContratDao.deleteByCode(code);
		return deleteContrat+deleteTypeContrat;
	}
	
	
	@Autowired
	private TypeContratDao typeContratDao;
	@Autowired
	private ContratService contratService;

}