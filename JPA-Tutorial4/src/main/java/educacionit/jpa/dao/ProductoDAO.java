package educacionit.jpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import educacionit.jpa.entidades.Producto;
@Repository
public interface ProductoDAO extends CrudRepository<Producto, Integer>{


}
