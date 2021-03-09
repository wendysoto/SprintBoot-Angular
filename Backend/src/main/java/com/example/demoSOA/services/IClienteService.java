package com.example.demoSOA.services;

import java.util.List;

import com.example.demoSOA.models.cliente;



public interface IClienteService {

cliente create (cliente c);
	
	cliente update (cliente c);
	
	cliente findById (Integer id);
	
	List<cliente> findall ();
	
	void delete(Integer id);
}
