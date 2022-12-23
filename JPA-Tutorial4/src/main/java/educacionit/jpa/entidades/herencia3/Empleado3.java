package educacionit.jpa.entidades.herencia3;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Empleado3 extends Persona3 {
	private Double sueldo;
	private String legajo;
	
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

}
