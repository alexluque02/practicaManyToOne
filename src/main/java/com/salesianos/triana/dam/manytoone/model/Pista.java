package com.salesianos.triana.dam.manytoone.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pista {

	@Id
	@GeneratedValue
	private int id;
	
	private int numero;
	private double precio;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey (name="fk_deporte_pista"))
	private Deporte deporte;
	
}
