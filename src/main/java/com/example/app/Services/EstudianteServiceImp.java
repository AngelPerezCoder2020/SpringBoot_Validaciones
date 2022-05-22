package com.example.app.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.DAOS.EstudianteDAO;
import com.example.app.Entities.Estudiante;
import com.example.app.Exceptions.NotFoundException;

@Service
public class EstudianteServiceImp implements EstudianteService{

	@Autowired
	private EstudianteDAO dao;
	
	@Override
	public List<Estudiante> findAll() {
		return (List<Estudiante>)dao.findAll();
	}

	@Override
	public Estudiante findById(Long id) {
		Optional<Estudiante> resultado = dao.findById(id);
		if(resultado.isEmpty()) {
			throw new NotFoundException("Estudiante No Encontrado");
		}else {
			return resultado.get();
		}
	}

	@Override
	public Estudiante findByName(String name) {
		Estudiante resultado = dao.findByNombre(name);
		if(resultado==null) {
			throw new NotFoundException("Estudiante No Encontrado");
		}else {
			return resultado;
		}
	}

	@Override
	public void CreateEstudiante(Estudiante estudiante) {
		dao.save(estudiante);	
	}

	@Override
	public void ModificarEstudiante(Estudiante estudiante, Long id) {
		if(dao.existsById(id)) {
			estudiante.setId(id);
			dao.save(estudiante);
		}else {
			throw new NotFoundException("Estudiante No Encontrado");
		}
	}

	@Override
	public void EliminarEstudiante(Long id) {
		if(dao.existsById(id)) {
			 dao.deleteById(id);
		}else {
			throw new NotFoundException("Estudiante No Encontrado");
		}
	}

}