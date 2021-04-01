package com.example.demo.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class DeclarationIr {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	private Societe societe;
	@OneToOne
	private Employee employee;
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

		

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
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
		return "DeclarationIr [id=" + id + ", societe=" + societe + ", employee=" + employee + ", salaireBrute="
				+ salaireBrute + ", salaireNet=" + salaireNet + ", montantIr=" + montantIr + ", mois=" + mois
				+ ", annee=" + annee + "]";
	}

	public DeclarationIr(long id, Societe societe, Employee employee, double salaireBrute, double salaireNet,
			double montantIr, int mois, int annee) {
		super();
		this.id = id;
		this.societe = societe;
		this.employee = employee;
		this.salaireBrute = salaireBrute;
		this.salaireNet = salaireNet;
		this.montantIr = montantIr;
		this.mois = mois;
		this.annee = annee;
	}

	public DeclarationIr() {
		super();
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
