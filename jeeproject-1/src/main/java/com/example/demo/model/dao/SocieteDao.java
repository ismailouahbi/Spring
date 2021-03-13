package com.impot.revenuir.dao;


import com.impot.revenuir.bean.Societe;
import com.impot.revenuir.bean.TypeSociete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SocieteDao extends JpaRepository<Societe,Long> {
    public Societe findByIce(String ice) ;
    public int deleteByIce(String ice) ;
    public List<Societe> findByCapitalGreaterThan(double capital) ;

}
