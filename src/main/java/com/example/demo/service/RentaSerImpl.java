package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Pago;
import com.example.demo.modelo.Renta;
import com.example.demo.repository.IAutomovilRepo;
import com.example.demo.repository.IClienteRepo;
import com.example.demo.repository.IPagoRepo;
import com.example.demo.repository.IRentaRepo;

@Service

public class RentaSerImpl implements IRentaSer{
	@Autowired
	private IClienteRepo cliRepo;
	
	@Autowired
	private IAutomovilRepo autoRepo;
	
	@Autowired
	private IRentaRepo rentaRepo;
	
	@Autowired
	private IPagoRepo pagoRepo;
	

	@Override
	public void realizar(String placa, String cedula, Integer dias, String tarjera) {
		// TODO Auto-generated method stub
		
		Automovil auto = this.autoRepo.buscar(placa);
		Cliente cli = this.cliRepo.buscar(cedula);
		Renta ren = new Renta();
		ren.setDias(dias);
		List<Cliente> clientes = new ArrayList();
		clientes.add(cli);
		ren.setAutomoviles(null);
		ren.setClientes(clientes);
		List<Automovil> autos = new ArrayList();
		autos.add(auto);
		ren.setAutomoviles(autos);
		
		Pago pago = new Pago();
		
		
		
		
				}
	
	

}
