package com.example.demoSOA.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSOA.models.cliente;
import com.example.demoSOA.repositories.ClienteRepository;

@Service

public class ClienteService implements IClienteService{

	@Autowired
	private ClienteRepository clienteRepo;
	
	@Override
	public cliente create(cliente c) {
		
		return clienteRepo.save(c);
	}

	@Override
	public cliente update(cliente c) {
		return clienteRepo.save(c);	
	}

	@Override
	public cliente findById(Integer id) {
		Optional<cliente> clienteOpcional = clienteRepo.findById(id);	
		return clienteOpcional.orElse(null);
	}

	@Override
	public List<cliente> findall() {
		return clienteRepo.findAll();	
	}

	@Override
	public void delete(Integer id) {
		clienteRepo.deleteById(id);	
		
	}

}
