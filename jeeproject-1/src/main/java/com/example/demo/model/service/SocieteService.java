package com.impot.revenuir.service;


import com.impot.revenuir.bean.Societe;
import com.impot.revenuir.bean.TypeSociete;
import com.impot.revenuir.dao.SocieteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SocieteService {

    @Autowired
    private SocieteDao societeDao ;
    @Autowired
    private TypeSocieteService typeSocieteService ;

    public int save(String ice){
        Societe societe = findByIce(ice);
        if(societe!=null)
            return -1 ;
        else if (societe.getCapital()<10000)
            return -1 ;
        TypeSociete typeSociete = typeSocieteService.findByCode(societe.getTypeSociete().getCode());
        if (typeSociete == null)
            return -3;
        else {

            societeDao.save(societe) ;
            return 1;
        }

    }

    public Societe findByIce(String ice) {

        return societeDao.findByIce(ice);
    }
    @Transactional
    public int deleteByIce(String ice) {

        return societeDao.deleteByIce(ice);
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
}
