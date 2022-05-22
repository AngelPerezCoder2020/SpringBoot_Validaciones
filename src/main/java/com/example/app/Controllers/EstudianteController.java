package com.example.app.Controllers;

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

import com.example.app.Entities.Estudiante;
import com.example.app.Services.EstudianteService;

@RestController
@RequestMapping("/Estudiantes")
public class EstudianteController {
	
	@Autowired
	private EstudianteService service;
	
	@GetMapping()
	public List<Estudiante> ListarEstudiantes(){
		return service.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Estudiante findById(@PathVariable Long id) {
		return service.findById(id);
	}
	@GetMapping(value = "/PorNombre/{nombre}")
	public Estudiante findByName(@PathVariable String nombre) {
		return service.findByName(nombre);
	}
	
	@PostMapping()
	public void CreateEstudiante(@RequestBody Estudiante estudiante) {
		service.CreateEstudiante(estudiante);
	}
	
	@PutMapping(value ="/{id}")
	public void ModificarEstudiante(@PathVariable Long id, @RequestBody Estudiante estudiante) {
		service.ModificarEstudiante(estudiante, id);
	}
	
	@DeleteMapping(value = "/{id}")
	public void EliminarEstudiante(@PathVariable Long id) {
		service.EliminarEstudiante(id);
	}
}