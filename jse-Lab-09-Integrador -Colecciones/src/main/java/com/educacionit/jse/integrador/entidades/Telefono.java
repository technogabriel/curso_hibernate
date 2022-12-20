package com.educacionit.jse.integrador.entidades;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Telefono {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String tipo;
	private String numero;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Persona persona;
	
	@Override
	public String toString() {
		return "Telefono " + tipo + ": " + numero;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	

}
