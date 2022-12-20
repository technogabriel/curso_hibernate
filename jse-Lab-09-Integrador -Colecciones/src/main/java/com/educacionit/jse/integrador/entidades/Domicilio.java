package com.educacionit.jse.integrador.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Domicilio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int numero;
	private String calle;
	private String localidad;
	
	public Domicilio() {
	}
	
	public Domicilio(int numero, String calle, String localidad) {
		this.numero = numero;
		this.calle = calle;
		this.localidad = localidad;
	}
	
	@Override
	public String toString() {
		return "Vive en: " + calle + " " + numero + ", " +localidad;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

}
