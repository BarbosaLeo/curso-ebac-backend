package com.barbosaleo.dao;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import com.barbosaleo.domain.Cliente;

public class ClienteMapDAO implements IClienteDAO{
	
	private Map<Long, Cliente> map;
	
	public ClienteMapDAO() { map = new TreeMap<>();}
	
	@Override
	public Boolean cadastrar(Cliente cliente) {
		if(map.containsKey(cliente.getCpf())) { 
			return false; }
		map.put(cliente.getCpf(), cliente);
		return true;
	}

	@Override
	public void excluir(Long cpf) {
		if(map.containsKey(cpf)) {
			Cliente cliente = map.get(cpf);
			map.remove(cliente.getCpf(),cliente);
		}
	}

	@Override
	public void alterar(Cliente cliente) {
		Cliente clienteAlterar = map.get(cliente.getCpf());
		clienteAlterar.setNome(cliente.getNome());
		clienteAlterar.setTel(cliente.getTel());
		clienteAlterar.setEnd(cliente.getEnd());
		clienteAlterar.setCidade(cliente.getCidade());
		clienteAlterar.setEstado(cliente.getEstado());
	}

	@Override
	public Cliente consultar(Long cpf) {
		return this.map.get(cpf);
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		return this.map.values();
	}
	
	
	
}
