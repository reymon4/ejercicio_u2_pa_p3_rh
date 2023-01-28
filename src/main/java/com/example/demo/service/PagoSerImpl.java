package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Pago;
import com.example.demo.repository.IPagoRepo;

@Service
public class PagoSerImpl implements IPagoSer{

	@Autowired 
	private IPagoRepo pagoRepo;
	@Override
	public void insertar(Pago pago) {
		// TODO Auto-generated method stub
		this.pagoRepo.insertar(pago);
	}
	

}
