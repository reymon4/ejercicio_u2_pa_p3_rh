package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Cliente;
import com.example.demo.service.IAutomovilSer;
import com.example.demo.service.IClienteSer;

@SpringBootApplication
public class EjercicioU2PaP3RhApplication implements CommandLineRunner {

	
	
	@Autowired
	private IAutomovilSer autoSer;
	
	
	@Autowired 
	private IClienteSer cliSer;
	
	@Autowired
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU2PaP3RhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
	//Literal 1
		Automovil auto = new Automovil();
		auto.setNombre("ABC123");
		auto.setValor(new BigDecimal(20));

		this.autoSer.insertar(auto);
		
		
		Cliente cli = new Cliente();
		cli.setCedula("172037133");
		cli.setNombre("User1");
	
		this.cliSer.insertar(cli);
		
		
	//Literal 3
		this.autoSer.buscar(auto.getNombre(), cli.getCedula());
		
		
		this.cliSer.buscar(cli.getCedula(), auto.getNombre());
		
		
	}

}
