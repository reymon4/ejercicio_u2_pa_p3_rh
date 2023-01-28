package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Cliente;
import com.example.demo.repository.IAutomovilRepo;
import com.example.demo.repository.IClienteRepo;

@Service
public class AutomovilSerImpl  implements IAutomovilSer{

	@Autowired
	private IAutomovilRepo autoRepo;
	
	@Autowired
	private IClienteRepo cliRepo;
	
	@Override
	public void insertar(Automovil auto) {
		// TODO Auto-generated method stub
	this.autoRepo.insertar(auto);	
	}

	@Override
	public Automovil buscar(String placa, String cedula ) {
		// TODO Auto-generated method stub
		Automovil auto = this.autoRepo.buscar(placa);
		Cliente cli = this.cliRepo.buscar(cedula);
		if(cli.getRenta().equals(auto.getRenta())) {
			return this.autoRepo.buscar(placa);
		}else {
			System.out.println("El automóvil no corresponde con el cliente dado");
			return null;
		}
		
		
	}

}
