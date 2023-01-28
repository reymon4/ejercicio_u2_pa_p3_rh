package com.example.demo.repository;

import com.example.demo.modelo.Cliente;

public interface IClienteRepo {

	public void insertar(Cliente cli);
	
		public Cliente buscar(String cedula);
	

}
