package com.example.app.DAOS;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.app.Entities.Estudiante;

@Repository
public interface EstudianteDAO extends CrudRepository<Estudiante, Long> {
	public Estudiante findByNombre(String name);
}