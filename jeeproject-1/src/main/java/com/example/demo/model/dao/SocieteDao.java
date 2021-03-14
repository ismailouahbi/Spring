package com.example.demo.model.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Societe;

import java.util.List;

@Repository
public interface SocieteDao extends JpaRepository<Societe,Long> {
    public Societe findByIce(String ice) ;
    public int deleteByIce(String ice) ;
    public List<Societe> findByCapitalGreaterThan(double capital) ;

}
