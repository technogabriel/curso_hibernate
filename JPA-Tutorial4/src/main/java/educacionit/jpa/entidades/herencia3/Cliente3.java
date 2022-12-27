package educacionit.jpa.entidades.herencia3;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Cliente3 extends Persona3{
	private Long numeroCliente;
	private Integer cantidadDeCompras;
	
	public Long getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(Long numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	public Integer getCantidadDeCompras() {
		return cantidadDeCompras;
	}
	public void setCantidadDeCompras(Integer cantidadDeCompras) {
		this.cantidadDeCompras = cantidadDeCompras;
	}

}
