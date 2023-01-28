package com.example.demo.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="automovil")
public class Automovil {
	
	@Id 
	@Column(name="au_plac")
	private String placa;
	
	@Column (name="au_valor")
	private BigDecimal valor;
	
	
	@OneToMany(mappedBy="automovil", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)  
	private List<Renta> renta;


	@Override
	public String toString() {
		return "Automovil [nombre=" + placa + ", valor=" + valor + ", renta=" + renta + "]";
	}


	public String getNombre() {
		return placa;
	}


	public void setNombre(String placa) {
		this.placa= placa;
	}


	public BigDecimal getValor() {
		return valor;
	}


	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}


	public List<Renta> getRenta() {
		return renta;
	}


	public void setRenta(List<Renta> renta) {
		this.renta = renta;
	}
	
	
	
	
}
