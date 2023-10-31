package crud.tarea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class EmpleadoService {
    
    @Autowired 
    private EmpleadoRepository empleadoRepository;
    
    //CRUD
    //Create
    public Empleado save (Empleado entity)
    {
        return empleadoRepository.save(entity); //Guardar y retorna
    }
    
    //Read
    public Empleado findById(long id)
    {
        return empleadoRepository.findById(id).orElse(other:null);
    }

    //Update no se crea ningun metodo se usa el metodo create
    //delete

    public void deleteById(long id)
    {
        empleadoRepository.deleteById(id);
    }

    //Select all
    public List<Empleado> findAll()
    {
        return empleadoRepository.findAll();
    }
    
}
