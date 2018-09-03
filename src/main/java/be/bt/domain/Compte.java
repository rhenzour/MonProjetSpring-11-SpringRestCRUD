package be.bt.domain;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Comptes")
public class Compte {
	@Id
	@Column(name = "numero")
	private String num;
	private String proprietaire;
	private BigDecimal solde;

	public Compte() {
	}

	@Override
	public String toString() {
		return "Compte [num=" + num + ", proprietaire=" + proprietaire + ", solde=" + solde + "]";
	}

	public Compte(String num, String proprietaire, BigDecimal solde) {
		super();
		this.num = num;
		this.proprietaire = proprietaire;
		this.solde = solde;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	public BigDecimal getSolde() {
		return solde;
	}

	public void setSolde(BigDecimal solde) {
		this.solde = solde;
	}

}