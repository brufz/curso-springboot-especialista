package io.github.brufz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.brufz.model.Cliente;
import io.github.brufz.repository.ClientesRepository;

@Service
public class ClientesService {
	
	@Autowired
	private ClientesRepository repository;
	

	public void salvarCliente(Cliente cliente) {
		validarCliente(cliente);
		repository.persistir(cliente);
	}
	
	public void validarCliente(Cliente cliente) {
		//aplica validações
	}

}
