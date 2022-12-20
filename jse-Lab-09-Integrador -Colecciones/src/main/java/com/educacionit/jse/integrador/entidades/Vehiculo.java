package com.educacionit.jse.integrador.entidades;

import javax.persistence.Entity;

/*
 * Vehiculo.java
 *
 */

/**
 *
 * @author Sebastian S. Sanga <SebastianSanga@educacionIT.com.ar>
 */

public class Vehiculo {
	// Atributos
	private int ancho;
	private int largo;
	private int altura;

  
    public String toString() {
        return "Altura:" + altura + "cm - Ancho:" + ancho + "cm - Largo:" + largo;
    }


    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
