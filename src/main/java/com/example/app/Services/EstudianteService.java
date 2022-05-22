package com.example.app.Services;

import java.util.List;

import com.example.app.Entities.Estudiante;

public interface EstudianteService {
	public List<Estudiante> findAll();
	public Estudiante findById(Long id);
	public Estudiante findByName(String name);
	public void CreateEstudiante(Estudiante estudiante);
	public void ModificarEstudiante(Estudiante estudiante, Long id);
	public void EliminarEstudiante(Long id);
}
