package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ClienteRepoImpl implements IClienteRepo {

	

	@PersistenceContext
	private EntityManager eM;
	@Override
	public void insertar(Cliente cli) {
		// TODO Auto-generated method stub
		this.eM.persist(cli);
	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.eM.find(Cliente.class, cedula);
	}

}
