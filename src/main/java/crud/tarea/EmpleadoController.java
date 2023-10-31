package crud.tarea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("api/admin")
@CrossOrigin({"*"})

public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping("/") //sub ruta para saber cuando guardar
    public Empleado save(@RequestBody Empleado entity) //para json @RequestBody
    {
        return empleadoService.save(entity);
    }

    //para el metodo red
    @GetMapping("/{id}/")
    public Empleado findById(@PathVariable long id)
    {
        return empleadoService.findById(id);
    }

    //para el update
    @PutMapping("/")
    public Empleado update(@RequestBody Empleado entity)
    {
        return empleadoService.save(entity);
    }

    //para el delete
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id)
    {
        empleadoService.deleteById(id);
    }

}

