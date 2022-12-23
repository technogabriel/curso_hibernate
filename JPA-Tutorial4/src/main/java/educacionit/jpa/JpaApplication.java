package educacionit.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import educacionit.jpa.entidades.herencia1.Cliente1;
import educacionit.jpa.entidades.herencia1.Empleado1;
import educacionit.jpa.entidades.herencia1.Empleado1DAO;
import educacionit.jpa.entidades.herencia1.Persona1;
import educacionit.jpa.entidades.herencia1.Persona1DAO;
import educacionit.jpa.entidades.herencia2.Cliente2;
import educacionit.jpa.entidades.herencia2.Cliente2DAO;
import educacionit.jpa.entidades.herencia2.Empleado2;
import educacionit.jpa.entidades.herencia2.Empleado2DAO;
import educacionit.jpa.entidades.herencia3.Cliente3;
import educacionit.jpa.entidades.herencia3.Cliente3DAO;
import educacionit.jpa.entidades.herencia3.Empleado3;
import educacionit.jpa.entidades.herencia3.Empleado3DAO;
import educacionit.jpa.entidades.herencia4.Cliente4;
import educacionit.jpa.entidades.herencia4.Cliente4DAO;
import educacionit.jpa.entidades.herencia4.Empleado4;
import educacionit.jpa.entidades.herencia4.Empleado4DAO;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner{

	  @Autowired
	  Persona1DAO dao;
	  
	  @Autowired
	  Empleado1DAO empleado1Dao;
	    
	  @Autowired
	  Cliente4DAO cliente4Dao;
	  
	  @Autowired
	  Cliente2DAO cliente2Dao;
	  
	  @Autowired
	  Empleado2DAO empleado2Dao;
	  
	  @Autowired
	  Empleado3DAO empleado3Dao;
	  
	  @Autowired
	  Cliente3DAO cliente3Dao;
	  
	  @Autowired
	  Empleado4DAO empleado4Dao;
	  
	  
	  
	  public static void main(String[] args) {
	    SpringApplication.run(JpaApplication.class, args);
	  }
	  @Override
	  public void run(String... args) throws Exception {
		  
		  //Ejemplo 1
		  
//		  Cliente1 p = new Cliente1();
//		  p.setApellido("Perez2");
//		  p.setNombre("Max2i");
//		  p.setCantidadDeCompras(2);
//		  p.setNumeroCliente(232433L);
//		  dao.save(p);

		  Iterable<Persona1> nombre = dao.findAll();
		  for(Persona1 p : nombre) {
			  System.out.println("nombres en la tabla :" + p.getNombre());
		  }	  
		  System.out.println("datos del empleado: " + empleado1Dao.findById(2).get().getApellido());
	  		  
//		  Empleado1 e = new Empleado1();
//		  e.setApellido("perez");
//		  e.setNombre("Pablo");
//		  e.setLegajo("Leg-1234");
//		  e.setSueldo(25700.35);
//		  
//		  dao.save(e);
		  
//		  Cliente1 c2 = new Cliente1();
//		  c2.setApellido("Ramirez");
//		  c2.setNombre("Alejandro");
//		  c2.setCantidadDeCompras(4);
//		  c2.setNumeroCliente(335778L);
//		  
//		  dao.save(c2);
//
//		  
//		  Empleado1 e2 = new Empleado1();
//		  e2.setApellido("Martinez");
//		  e2.setNombre("Harina");
//		  e2.setLegajo("Leg-331");
//		  e2.setSueldo(30500.25);
//		  
//		  dao.save(e2);
		  
		  //Ejemplo2
//		  Cliente2 c2 = new Cliente2();
//		  c2.setApellido("Perez2");
//		  c2.setNombre("Max2i");
//		  c2.setCantidadDeCompras(2);
//		  c2.setNumeroCliente(232433L);
//		  
//		  cliente2Dao.save(c2);
//		  
//		  Cliente2 c2a = new Cliente2();
//		  c2a.setApellido("Diaz");
//		  c2a.setNombre("Santiago");
//		  c2a.setCantidadDeCompras(21);
//		  c2a.setNumeroCliente(232433475L);
//		  
//		  cliente2Dao.save(c2a);
//		  
//		  Empleado2 em2 = new Empleado2();
//		  em2.setApellido("Ruiz");
//		  em2.setNombre("Andres");
//		  em2.setLegajo("LE-123");
//		  em2.setSueldo(2550.41);
//		  
//		  empleado2Dao.save(em2);
//		  
//		  Empleado2 em3 = new Empleado2();
//		  em3.setApellido("Martinez");
//		  em3.setNombre("Andres");
//		  em3.setLegajo("LE-1222");
//		  em3.setSueldo(2550.41);
//		  
//		  empleado2Dao.save(em3);
		  
		  Iterable<Empleado2>e2 = empleado2Dao.findAll();
		  for(Empleado2 e : e2 ) {
			  System.out.println("empleados ejemplo 2 : " + e.getLegajo());
		  }
//		  
		  
		  //Ejemplo 3
		  Cliente3 c3 = new Cliente3();
		  c3.setApellido("Perez2");
		  c3.setNombre("Max2i");
		  c3.setCantidadDeCompras(2);
		  c3.setNumeroCliente(232433L);
		  
		  cliente3Dao.save(c3);
//		  
		  Cliente3 c3a = new Cliente3();
		  c3a.setApellido("Morali");
		  c3a.setNombre("Max2i");
		  c3a.setCantidadDeCompras(2);
		  c3a.setNumeroCliente(232433L);
		  
		  cliente3Dao.save(c3a);
//		  
		  Empleado3 em3 = new Empleado3();
		  em3.setApellido("Ruiz");
		  em3.setNombre("Andres");
		  em3.setLegajo("LE-123");
		  em3.setSueldo(2550.41);
		  
		  empleado3Dao.save(em3);
//		  
		  Empleado3 em3a = new Empleado3();
		  em3a.setApellido("Martinez");
		  em3a.setNombre("Andres");
		  em3a.setLegajo("LE-1222");
		  em3a.setSueldo(2550.41);
		  
		  empleado3Dao.save(em3a);
		  
		  
//		  //Ejemplo4
//		  Cliente4 c4 = new Cliente4();
//		  c4.setApellido("Perez2");
//		  c4.setNombre("Max2i");
//		  c4.setCantidadDeCompras(2);
//		  c4.setNumeroCliente(232433L);
//		  
//		  cliente4Dao.save(c4);
//		  
//		  Cliente4 c4a = new Cliente4();
//		  c4a.setApellido("Morali");
//		  c4a.setNombre("Max2i");
//		  c4a.setCantidadDeCompras(2);
//		  c4a.setNumeroCliente(232433L);
//		  
//		  cliente4Dao.save(c4a);
//		  
//		  Empleado4 em4 = new Empleado4();
//		  em4.setApellido("Ruiz");
//		  em4.setNombre("Andres");
//		  em4.setLegajo("LE-123");
//		  em4.setSueldo(2550.41);
//		  
//		  empleado4Dao.save(em4);
//		  
//		  Empleado4 em4a = new Empleado4();
//		  em4a.setApellido("Martinez");
//		  em4a.setNombre("Andres");
//		  em4a.setLegajo("LE-1222");
//		  em4a.setSueldo(2550.41);
//		  
//		  empleado4Dao.save(em4a);
		
	  }


}
