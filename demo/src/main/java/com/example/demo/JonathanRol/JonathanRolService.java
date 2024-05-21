package com.example.demo.JonathanRol;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JonathanRolService {

     @Autowired
    private JonathanRolRepository jonathanRolRepository;

    //CRUD
    //metodo insert
    public JonathanRol jonathanSave(JonathanRol entity) {
        return jonathanRolRepository.save(entity);
    }

    //metodo select
    public JonathanRol jonathanFindById(Long id) {
        return jonathanRolRepository.findById(id).orElse(null);
    }

    //Metodo select all
    public List<JonathanRol> jonathanFindAll() {
        Iterable<JonathanRol> iterable = jonathanRolRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                            .collect(Collectors.toList());
    }

    //Metodo delete
    public void jonathanDeleteById(Long id) {
        jonathanRolRepository.deleteById(id);
    }
    // Método para eliminar por nombre de rol
    public void jonathanDeleteByNombreRol(String nombreRol) {
        jonathanRolRepository.deleteByNombreRol(nombreRol);
    }
}
