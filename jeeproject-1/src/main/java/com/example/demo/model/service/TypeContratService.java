package com.example.demo.model.service;


import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.bean.TypeContrat;
import com.example.demo.model.dao.TypeContratDao;

@Service
public class TypeContratService {
	
    public int save(TypeContrat typeContrat) {
    	if(findByCode(typeContrat.getCode())!=null) {
    		return -1;
    	}
    	else {
    		typeContratDao.save(typeContrat);
    		return -1;
    	}
    }
	public TypeContrat findByCode(String code) {
		return typeContratDao.findByCode(code);
	}
	
	@Transactional
	public int deleteByCode(String code) {
		return typeContratDao.deleteByCode(code);
	}
	
	public List<TypeContrat> findAll() {
		return typeContratDao.findAll();
	}
	
	@Autowired
	private TypeContratDao	 typeContratDao;

}
