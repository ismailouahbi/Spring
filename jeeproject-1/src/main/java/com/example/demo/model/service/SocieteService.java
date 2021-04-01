package com.example.demo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Societe;
import com.example.demo.bean.TypeSociete;
import com.example.demo.model.dao.SocieteDao;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SocieteService {

    public int save(Societe societe){
    	
        if(findByIce(societe.getIce())!=null)
            return -1 ;
        else if (societe.getCapital()<10000)
            return -1 ;
        TypeSociete typeSociete = typeSocieteService.findByCode(societe.getTypeSociete().getCode());
      
        if (typeSociete == null)
            return -3;
        else {
        	societe.setTypeSociete(typeSociete);
            societeDao.save(societe);
            return 1;
        }

    }

    public Societe findByIce(String ice) {

        return societeDao.findByIce(ice);
    }
    @Transactional
    public int deleteByIce(String ice) {
       int deletec = contratService.deleteBySocieteIce(ice);
       int deletes = societeDao.deleteByIce(ice);
       return deletec + deletes;
    }

    public List<Societe> findByCapitalGreaterThan(double capital) {
        return societeDao.findByCapitalGreaterThan(capital);
    }

    public List<Societe> findAll() {

        return societeDao.findAll();
    }

    public Societe getOne(Long id) {

        return societeDao.getOne(id);
    }
    
    @Autowired
    private SocieteDao societeDao ;
    @Autowired
    private TypeSocieteService typeSocieteService ;
    @Autowired
	private ContratService contratService;
}

