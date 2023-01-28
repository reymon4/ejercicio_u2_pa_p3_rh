package com.example.demo.service;

import com.example.demo.modelo.Cliente;

public interface IClienteSer {

	public void insertar(Cliente cli);
	
	public Cliente buscar(String cedula, String placa);

}
