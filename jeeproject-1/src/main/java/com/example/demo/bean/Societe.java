package com.example.demo.bean;
import javax.persistence.*;

@Entity
public class Societe {
@Id   @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id ;
    private String ice ;
    private String identifiantFiscal ;
    private String codeCnss ;
    private String ville ;
    private double capital ;
    @ManyToOne
    private TypeSociete typeSociete ;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIce() {

        return ice;
    }

    public void setIce(String ice) {

        this.ice = ice;
    }

    public String getIdentifiantFiscal() {

        return identifiantFiscal;
    }

    public void setIdentifiantFiscal(String identifiantFiscal) {

        this.identifiantFiscal = identifiantFiscal;
    }

    public String getCodeCnss() {

        return codeCnss;
    }

    public void setCodeCnss(String codeCnss) {

        this.codeCnss = codeCnss;
    }

    public String getVille() {

        return ville;
    }

    public void setVille(String ville) {

        this.ville = ville;
    }

    public double getCapital() {

        return capital;
    }

    public void setCapital(double capital) {

        this.capital = capital;
    }

    public TypeSociete getTypeSociete() {
        return typeSociete;
    }

    public void setTypeSociete(TypeSociete typeSociete) {
        this.typeSociete = typeSociete;
    }
}
