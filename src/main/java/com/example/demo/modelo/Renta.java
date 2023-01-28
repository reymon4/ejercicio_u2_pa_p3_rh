package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="renta")
public class Renta {
	
	@Id //Esta anotación es para definir la clave primaria
	@Column (name="ren_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ren_sec") //Creo la secuencia a través de una secuencia-> name
	@SequenceGenerator (name= "ren_sec", sequenceName="ren_sec", allocationSize =1)
	private Integer id;
	
	@Column (name="ren_fecha")
	private LocalDateTime fecha;
	
	@Column (name="ren_dias")
	private Integer dias;
	
	
	@Column (name="ren_valor")
	private BigDecimal valor;
	
	
	
	@OneToOne(mappedBy = "renta", cascade = CascadeType.ALL) 
	private Pago pago;
	
	
	@ManyToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "ren_id_cliente")
	private List<Cliente> clientes;
	
	@ManyToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "ren_id_automovil")
	private List<Automovil> automoviles;
	
	
	
	
	



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public LocalDateTime getFecha() {
		return fecha;
	}



	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}



	public Integer getDias() {
		return dias;
	}



	public void setDias(Integer dias) {
		this.dias = dias;
	}



	public BigDecimal getValor() {
		return valor;
	}



	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}



	public Pago getPago() {
		return pago;
	}



	public void setPago(Pago pago) {
		this.pago = pago;
	}



	public List<Cliente> getClientes() {
		return clientes;
	}



	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}



	public List<Automovil> getAutomoviles() {
		return automoviles;
	}



	public void setAutomoviles(List<Automovil> automoviles) {
		this.automoviles = automoviles;
	}



	@Override
	public String toString() {
		return "Renta [id=" + id + ", fecha=" + fecha + ", dias=" + dias + ", valor=" + valor + ", pago=" + pago + "]";
	}

	
	
	
	
}
