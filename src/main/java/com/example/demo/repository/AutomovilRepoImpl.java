package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutomovilRepoImpl implements IAutomovilRepo{


	@PersistenceContext
	private EntityManager eM;
	@Override
	public void insertar(Automovil auto) {
		// TODO Auto-generated method stub
		this.eM.persist(auto);
	}
	@Override
	public Automovil buscar(String placa) {
		// TODO Auto-generated method stub
		return this.eM.find(Automovil.class, placa);
	}

}
