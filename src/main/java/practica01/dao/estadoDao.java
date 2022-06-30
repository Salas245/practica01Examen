package practica01.dao;

import org.springframework.data.repository.CrudRepository;
import practica01.domain.Estado;


public interface estadoDao extends CrudRepository<Estado, Long>{
    
}
