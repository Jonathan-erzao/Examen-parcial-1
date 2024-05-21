package com.example.demo.JonathanRol;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface JonathanRolRepository extends CrudRepository<JonathanRol, Long> {

    @Modifying
    @Transactional
    @Query("DELETE FROM JonathanRol r WHERE r.nombre_rol = ?1")
    void deleteByNombreRol(String nombreRol);
  
}
