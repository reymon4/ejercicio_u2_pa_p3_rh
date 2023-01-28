package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Column(name="cli_nombre")
	private String nombre;
	
	@Id 
	@Column (name="cli_cedula")
	private String cedula;
	
	
	@OneToMany(mappedBy="cliente", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)  
	private List<Renta> renta;


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public List<Renta> getRenta() {
		return renta;
	}


	public void setRenta(List<Renta> renta) {
		this.renta = renta;
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", cedula=" + cedula + ", renta=" + renta + "]";
	}
	
	
	
	
	
	
	
	
}
