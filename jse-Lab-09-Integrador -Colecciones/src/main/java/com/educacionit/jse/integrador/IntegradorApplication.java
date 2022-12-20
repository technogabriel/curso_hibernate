package com.educacionit.jse.integrador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.educacionit.jse.integrador.dao.IPersonaDAO;
import com.educacionit.jse.integrador.dao.IProductoDAO;
import com.educacionit.jse.integrador.entidades.Persona;
import com.educacionit.jse.integrador.entidades.Producto;
import com.educacionit.jse.integrador.entidades.Telefono;


@SpringBootApplication
public class IntegradorApplication implements CommandLineRunner {
	
	@Autowired
	IProductoDAO productoDao;
	
	@Autowired
	IPersonaDAO personaDao;
	
	public static void main(String[] args) {
	    SpringApplication.run(IntegradorApplication.class, args);
	  }

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		  Producto prod = new Producto();
		  prod.setDescripcion("consolas");
		  prod.setPrecio(888.4);
		  
		  //saveProducto
		  productoDao.save(prod);
		  
		  Producto prod1 = new Producto();
		  prod1.setDescripcion("herramientas");
		  prod1.setPrecio(1500);
		  
		  //saveProducto
		  productoDao.save(prod1);
	  
		  System.out.println(productoDao.findByDescripcion("algo").size());
		  
		  /*
		   
		   Persona y telefono 
		   */
		  Persona p = new Persona();
		  p.setApellido("Gomez");
		  p.setNombre("Pablo");
  
		  Telefono t = new Telefono();
		  t.setNumero("899999991");
		  t.setTipo("Celu");
		  p.addTelefono(t);
		  //SavePersona
		  personaDao.save(p);
		  
		  //Find ByName
		  personaDao.findByName("Pablo").forEach((persona)->System.out.println(persona.getApellido()));
		  
		  	 //Find ById
			  p = personaDao.findById(1).get();
			 System.out.println(p.getApellido());
			 
			 //GetAll
			 List personas =  personaDao.findAll();
			 System.out.println(personas.size());
		  
		  
		  
		
	}

}
