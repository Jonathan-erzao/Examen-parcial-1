package com.example.demo.JonathanPersonaje;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JonathanPersonajeService {
    @Autowired
    private JonathanPersonajeRepository jonathanPersonajeRepository;

    //CRUD
    //metodo insert
    public JonathanPersonaje jonathanSave(JonathanPersonaje entity) {
        return jonathanPersonajeRepository.save(entity);
    }

    //metodo select
    public JonathanPersonaje jonathanFindById(Long id) {
        return jonathanPersonajeRepository.findById(id).orElse(null);
    }

    //Metodo select all
    public List<JonathanPersonaje> jonathanFindAll() {
        Iterable<JonathanPersonaje> iterable = jonathanPersonajeRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                            .collect(Collectors.toList());
    }

    //Metodo delete
    public void jonathanDeleteById(Long id) {
        jonathanPersonajeRepository.deleteById(id);
    }
}
