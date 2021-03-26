package com.example.demo.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class TauxDeclarationIr {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	private  double salaireMin;
	private   double salaireMax;
	private double salaire;
	private  double pourcentage;
	
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public  double getSalaireMin() {
		return salaireMin;
	}
	public void setSalaireMin(double salaireMin) {
		this.salaireMin = salaireMin;
	}
	public double getSalaireMax() {
		return salaireMax;
	}
	public void setSalaireMax(double salaireMax) {
		this.salaireMax = salaireMax;
	}
	public  double getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}

	
	
}
