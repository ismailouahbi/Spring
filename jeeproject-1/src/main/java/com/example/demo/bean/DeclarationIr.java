package com.example.demo.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DeclarationIr {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String iceSociete;
	private String refEmployee;
	private double salaireBrute;
	private double salaireNet;
	private double montantIr;
	private int mois;
	private int annee;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIceSociete() {
		return iceSociete;
	}

	public void setIceSociete(String iceSociete) {
		this.iceSociete = iceSociete;
	}

	public String getRefEmployee() {
		return refEmployee;
	}

	public void setRefEmployee(String refEmployee) {
		this.refEmployee = refEmployee;
	}

	public double getSalaireBrute() {
		return salaireBrute;
	}

	public void setSalaireBrute(double salaireBrute) {
		this.salaireBrute = salaireBrute;
	}

	public double getSalaireNet() {
		return salaireNet;
	}

	public void setSalaireNet(double salaireNet) {
		this.salaireNet = salaireNet;
	}

	public double getMontantIr() {
		return montantIr;
	}

	public void setMontantIr(double montantIr) {
		this.montantIr = montantIr;
	}

	@Override
	public String toString() {
		return "DeclarationIr [id=" + id + ", iceSociete=" + iceSociete + ", refEmployee=" + refEmployee
				+ ", salaireBrute=" + salaireBrute + ", salaireNet=" + salaireNet + ", montantIr=" + montantIr + "]";
	}

	public DeclarationIr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeclarationIr(long id, String iceSociete, String refEmployee, double salaireBrute, double salaireNet,
			double montantIr) {
		super();
		this.id = id;
		this.iceSociete = iceSociete;
		this.refEmployee = refEmployee;
		this.salaireBrute = salaireBrute;
		this.salaireNet = salaireNet;
		this.montantIr = montantIr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeclarationIr other = (DeclarationIr) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	
	
}
