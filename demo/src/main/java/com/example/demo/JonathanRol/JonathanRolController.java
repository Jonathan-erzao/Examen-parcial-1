package com.example.demo.JonathanRol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Jonathanrol")
public class JonathanRolController {

    @Autowired
    private JonathanRolService jonathanRolService;

    //Metodo create
    @PostMapping("/")
    public JonathanRol Jonathansave(@RequestBody JonathanRol entity)
    {
        return jonathanRolService.jonathanSave(entity);
    }

    //Metodo select
    @GetMapping("/{id}/")
    public JonathanRol JonathanfindById(@PathVariable Long id)
    {
        return jonathanRolService.jonathanFindById(id);
    }

    //Metodo select all
    @GetMapping("/all")
    public List<JonathanRol> JonathanfindAll() {
        return jonathanRolService.jonathanFindAll();
    }

    //Metodo update
    @PutMapping("/u")
    public JonathanRol Jonathanupdate(@RequestBody JonathanRol Entity)
    {
        return jonathanRolService.jonathanSave(Entity);
    }

    // Método delete
    @DeleteMapping("/{id}/")
    public void Jonathandelete(@PathVariable Long id) {
        jonathanRolService.jonathanDeleteById(id);
    }
    //método para eliminar por nombre de rol
    @DeleteMapping("/dn/{nombreRol}/")
    public void JonathanDeleteByNombreRol(@PathVariable String nombreRol) {
        jonathanRolService.jonathanDeleteByNombreRol(nombreRol);
    }
}
