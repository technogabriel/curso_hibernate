package educacionit.jpa.entidades.herencia1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Empleado1DAO extends CrudRepository<Empleado1, Integer> {

}
