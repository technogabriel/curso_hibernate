package com.educacionit.jse.integrador.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.educacionit.jse.integrador.entidades.Persona;

@Repository
public interface IPersonaDAO extends CrudRepository<Persona, Integer> {
	
	@Query("from Persona p where p.nombre = :personaNombre")
	public Iterable<Persona> findByName(@Param("personaNombre") String name);

	@Query("Select p from Persona p inner join p.telefonos t where t.numero = :numeroTelefono")
	public List findByPhone(@Param("numeroTelefono") Integer numero);
	
    @Override
    List<Persona> findAll();

}
