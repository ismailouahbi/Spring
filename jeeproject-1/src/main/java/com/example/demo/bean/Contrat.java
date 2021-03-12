package com.example.demo.bean;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Contrat {
	
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Employee employee;
    //@ToOne
    //private Socite societe;
    @OneToOne
    private TypeContrat typeContrat;
    private Date dateDemarage;
    private Date dateResiliation;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public TypeContrat getTypeContrat() {
		return typeContrat;
	}
	public void setTypeContrat(TypeContrat typeContrat) {
		this.typeContrat = typeContrat;
	}
	public Date getDateDemarage() {
		return dateDemarage;
	}
	public void setDateDemarage(Date dateDemarage) {
		this.dateDemarage = dateDemarage;
	}
	public Date getDateResiliation() {
		return dateResiliation;
	}
	public void setDateResiliation(Date dateResiliation) {
		this.dateResiliation = dateResiliation;
	} 
    
}
