package com.example.demo.JonathanPersonaje;

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
@RequestMapping("/Jonathanpersonaje")
public class JonathanPersonajeController {
    @Autowired
    private JonathanPersonajeService jonathanPersonajeService;

    //Metodo create
    @PostMapping("/")
    public JonathanPersonaje Jonathansave(@RequestBody JonathanPersonaje entity)
    {
        return jonathanPersonajeService.jonathanSave(entity);
    }

    //Metodo select
    @GetMapping("/{id}/")
    public JonathanPersonaje JonathanfindById(@PathVariable Long id)
    {
        return jonathanPersonajeService.jonathanFindById(id);
    }

    //Metodo select all
    @GetMapping("/all")
    public List<JonathanPersonaje> JonathanfindAll() {
        return jonathanPersonajeService.jonathanFindAll();
    }

    //Metodo update
    @PutMapping("/u")
    public JonathanPersonaje Jonathanupdate(@RequestBody JonathanPersonaje Entity)
    {
        return jonathanPersonajeService.jonathanSave(Entity);
    }

    // Método delete
    @DeleteMapping("/{id}/")
    public void Jonathandelete(@PathVariable Long id) {
        jonathanPersonajeService.jonathanDeleteById(id);
    }
}
