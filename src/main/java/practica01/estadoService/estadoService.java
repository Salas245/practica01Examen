package practica01.estadoService;

import java.util.List;
import practica01.domain.Estado;


public interface estadoService {
    public List<Estado> getEstados();
    
    public void save (Estado estado);
    
    public void delete (Estado estado);
    
    public Estado getEstado(Estado estado);
}
