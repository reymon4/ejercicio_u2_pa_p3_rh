package com.example.demo.service;

import com.example.demo.modelo.Automovil;

public interface IAutomovilSer {

	public void insertar(Automovil auto);

	public Automovil buscar(String placa, String cedula);
}
