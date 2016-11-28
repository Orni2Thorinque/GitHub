package com.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Bean entit� avec des annotations JPA
 * Hibernate fournit l'impl�mentation de JPA 
 */
@Entity
@Table(name="article")
public class Article {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="titre")
	private String titre;
	
	@Column(name="tendence")
	private String tendence;

	//Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getTendence() {
		return tendence;
	}

	public void setTendence(String tendence) {
		this.tendence = tendence;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", titre=" + titre + ", tendence=" + tendence + "]";
	}	
}
