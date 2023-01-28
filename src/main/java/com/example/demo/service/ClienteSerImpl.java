package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Cliente;
import com.example.demo.repository.IAutomovilRepo;
import com.example.demo.repository.IClienteRepo;

@Service
public class ClienteSerImpl implements IClienteSer{

	@Autowired
	private IAutomovilRepo autoRepo;
	
	@Autowired
	private IClienteRepo cliRepo;
	@Override
	public void insertar(Cliente cli) {
		// TODO Auto-generated method stub
	this.cliRepo.insertar(cli);	
	}

	@Override
	public Cliente buscar(String cedula, String placa) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Automovil auto = this.autoRepo.buscar(placa);
		Cliente cli = this.cliRepo.buscar(cedula);
		if(cli.getRenta().equals(auto.getRenta())) {
			return this.cliRepo.buscar(cedula);
		}else {
			System.out.println("El cliente no corresponde con el cliente ingresado");
			return null;
		}
		
	}

}
