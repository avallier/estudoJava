package br.com.avallier.modelo;

import java.io.Serializable;

public class Usuario implements Serializable {
	private static final long serialVersionUID = -7622455859723534219L;
	
	private String id;
	private String senha;
	private String nome;
	private Cpf cpf;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cpf getCpf() {
		return cpf;
	}
	public void setCpf(Cpf cpf) {
		this.cpf = cpf;
	}

}
