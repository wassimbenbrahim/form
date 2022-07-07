package com.project.cft.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Entity
@Table
@Data
@DynamicInsert
public class inscription implements Serializable {
	
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;

	  private String nom;

	  
	  private String prenom;

	  private Date datenaissance;
	  
	
	  private String lieu_de_naissance;
	  @Column(columnDefinition = "boolean default false")
	  private boolean status;

	  private String pays;
	  
	  
	  
	  private String adresse;
	  
	  
	  
	  private String telephone;
	  
	  @Column(unique = true)
	  private String email;


}
