package com.example.demo.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    
  	private long id;
	private String nom;
	private String prenom;
	private double salaireActuel;
	private String ref;
	//@
	//private Societe societeActelle;
	@OneToOne
	private TypeContrat typeContratActuel;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public double getSalaireActuel() {
		return salaireActuel;
	}
	public void setSalaireActuel(double salaireActuel) {
		this.salaireActuel = salaireActuel;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", salaireActuel=" + salaireActuel
				+ ", ref=" + ref + "]";
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(long id, String nom, String prenom, double salaireActuel, String ref) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.salaireActuel = salaireActuel;
		this.ref = ref;
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
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	

}
