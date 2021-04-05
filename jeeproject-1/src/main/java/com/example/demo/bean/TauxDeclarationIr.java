package com.example.demo.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class TauxDeclarationIr {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	private  double salaireMin;
	private   double salaireMax;
	private  double pourcentage;
//	@OneToOne
//	private DeclarationIr declarationIr;
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		long temp;
		temp = Double.doubleToLongBits(pourcentage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(salaireMax);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(salaireMin);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	public TauxDeclarationIr() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TauxDeclarationIr [id=" + id + ", salaireMin=" + salaireMin + ", salaireMax=" + salaireMax
				+ ", pourcentage=" + pourcentage + "]";
	}
	public TauxDeclarationIr(long id, double salaireMin, double salaireMax,
			double pourcentage) {
		super();
		this.id = id;
		this.salaireMin = salaireMin;
		this.salaireMax = salaireMax;
		this.pourcentage = pourcentage;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TauxDeclarationIr other = (TauxDeclarationIr) obj;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(pourcentage) != Double.doubleToLongBits(other.pourcentage))
			return false;
		if (Double.doubleToLongBits(salaireMax) != Double.doubleToLongBits(other.salaireMax))
			return false;
		if (Double.doubleToLongBits(salaireMin) != Double.doubleToLongBits(other.salaireMin))
			return false;
		return true;
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
