package com.costantino.application.entities;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Data // get, set,toString, hashcode, equals -> automatiche
@Table(name = "SALA")
@Entity
public class SalaEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2936869528214677956L;

	@Id // indica che id è chiave primaria nel DATABASE MIO.
	@SequenceGenerator(name = "SalaSequence", sequenceName = "SALA_ID_SALA_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SalaSequence")
	@Column(name = "ID_SALA", unique = true, nullable = false)
	private Long id;
	
	@EqualsAndHashCode.Include
	@Column(name="CODICE",nullable=false,length=5)
	private String codice; 
	
	@EqualsAndHashCode.Include
	@Column(name="NOME",nullable=false,length=20) // nullable = false -> non può essere null (not null)
	private String nome;
	
	@Column(name="CAPIENZA",nullable=true)
	private int capienza; 

}
