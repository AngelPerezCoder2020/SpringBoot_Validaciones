package com.example.app.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;

@Entity
@Table(name = "Estudiantes")
public class Estudiante {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_Estudiante")
	private Long id;
	
	@Column(name = "Nombre")
	@NotBlank(message = "El nombre no puede ser vacio")
	private String nombre;
	
	@Email()
	@Column(name = "Email")
	private String email;
	
	@NotBlank(message = "El Carnet no puede ser vacio")
	@Column(name = "Carnet")
	private String carnet;
	
	@NotNull(message="El promedio no puede ser null")
	@Column(name = "Promedio")
	private float promedio;
	
	@Column(name = "CreacionDate")
	@NotNull(message="La fecha no puede ser null")
	@Temporal(TemporalType.DATE)
	private Date creaciondate;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public float getPromedio() {
		return promedio;
	}

	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}

	public Date getCreaciondate() {
		return creaciondate;
	}

	public void setCreaciondate(Date creaciondate) {
		this.creaciondate = creaciondate;
	}
}