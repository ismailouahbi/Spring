package com.impot.revenuir.dao;


import com.impot.revenuir.bean.TypeSociete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeSocieteDao extends JpaRepository<TypeSociete,Long> {

    public TypeSociete findByCode(String code);
    public int deleteByCode(String code) ;


}
