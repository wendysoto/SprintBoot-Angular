package com.example.demoSOA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demoSOA.models.cliente;
import com.example.demoSOA.services.ClienteService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
private ClienteService variableClienteServ;
	
	@GetMapping
	public List<cliente> findAll(){
		return variableClienteServ.findall();
	}
	
	@PostMapping
	public cliente create ( @RequestBody cliente c) {
		return variableClienteServ.create(c);
	}
	
	
		
	@GetMapping("/{id}")
	public  cliente findById (@PathVariable("id") Integer id) {
		return variableClienteServ.findById(id);
	}
	
	
	@PutMapping ("/{id}")
	public cliente update ( @RequestBody cliente c, @PathVariable("id") Integer id) {
		c.setIdCliente(id);
		return variableClienteServ.update(c);
	}
	
	
	
	@DeleteMapping ("/{IdCliente}")
	public void delete (@PathVariable("IdCliente") Integer IdCliente) {
		variableClienteServ.delete(IdCliente);
	}

}
