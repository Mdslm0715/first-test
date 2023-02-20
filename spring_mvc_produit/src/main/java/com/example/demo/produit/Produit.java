package com.example.demo.produit;

import java.util.Date;

import javax.persistence.*;




@Entity
public class Produit {
	@Id
	@GeneratedValue 
	private long idProduit;
	private String nomProduit;
	private double prixProduit;
	private Date DateFab;
	
	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(long idProduit, String nomProduit, double prixProduit, Date dateFab) {
		
		super();
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
		this.DateFab = dateFab;
	}
	public long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(long idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public double getPrixProduit() {
		return prixProduit;
	}
	public void setPrixProduit(double prixProduit) {
		this.prixProduit = prixProduit;
	}
	public Date getDateFab() {
		return DateFab;
	}
	public void setDateFab(Date dateFab) {
		DateFab = dateFab;
	}
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prixProduit=" + prixProduit
				+ ", DateFab=" + DateFab + "]";
	} 

	
	
	
	
}
