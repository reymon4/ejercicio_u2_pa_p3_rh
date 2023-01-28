package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

public class Pago {
	@Id 
	@Column (name="pa_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pa_sec") //Creo la secuencia a través de una secuencia-> name
	@SequenceGenerator (name= "pa_sec", sequenceName="pa_sec", allocationSize =1)
	private Integer id;
	
	
	@Column (name="pa_tarjeta")
	private String numTarjeta;
	
	
	@Column (name="pa_valor")
	private BigDecimal valor;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pa_id_renta")
	private Renta renta;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Renta getRenta() {
		return renta;
	}

	public void setRenta(Renta renta) {
		this.renta = renta;
	}

	@Override
	public String toString() {
		return "Pago [id=" + id + ", numTarjeta=" + numTarjeta + ", valor=" + valor + ", renta=" + renta + "]";
	}



	

}
