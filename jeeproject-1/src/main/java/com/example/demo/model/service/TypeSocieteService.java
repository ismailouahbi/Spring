package com.example.demo.model.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.TypeSociete;
import com.example.demo.model.dao.TypeSocieteDao;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TypeSocieteService {

    @Autowired
    private TypeSocieteDao typeSocieteDao ;

    public int save(TypeSociete typeSociete){
        if(findByCode(typeSociete.getCode())!=null)
            return -1 ;
        else {
            typeSocieteDao.save(typeSociete);
            return 1 ;
        }

    }

    public int update(TypeSociete typeSociete) {
        if (findByCode(typeSociete.getCode()) == null)
            return -1;
        else {

            typeSocieteDao.save(typeSociete);
            return 1;

        }
    }
    public TypeSociete findByCode(String code) {
        return typeSocieteDao.findByCode(code);
    }
    @Transactional
    public int deleteByCode(String code) {
        return typeSocieteDao.deleteByCode(code);
    }

    public List<TypeSociete> findAll() {
        return typeSocieteDao.findAll();
    }

    public TypeSociete getOne(Long id) {
        return typeSocieteDao.getOne(id);
    }
}
