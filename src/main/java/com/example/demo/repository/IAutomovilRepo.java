package com.example.demo.repository;

import com.example.demo.modelo.Automovil;

public interface IAutomovilRepo {

	
	public void insertar(Automovil auto);

	public Automovil buscar(String placa);

}

