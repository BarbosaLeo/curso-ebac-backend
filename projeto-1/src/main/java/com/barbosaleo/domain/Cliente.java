package com.barbosaleo.domain;

import java.lang.reflect.Field;
import java.util.Objects;

public class Cliente {
	
	private String nome;
	private Long cpf;
	private Long tel;
	private String end;
	private String estado;
	private String cidade;
	
	public Cliente(String nome, String cpf, String tel, String end, String estado, String cidade) {
		this.nome = nome;
		this.cpf = Long.valueOf(cpf.trim());
		this.tel = Long.valueOf(tel.trim());
		this.end = end;
		this.estado = estado;
		this.cidade = cidade;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
        }
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
        public int getNumVars(){
            return this.getClass().getDeclaredFields().length;
        }
        public Field[] getVars(){
            return this.getClass().getDeclaredFields();
        }

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf);
	}


	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
}
