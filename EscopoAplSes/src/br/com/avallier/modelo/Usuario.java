package br.com.avallier.modelo;

public class Usuario {
	
	private String id;
	private String senha;
	private String nome;
	private Cpf cpf;
	
	public Usuario()	{
		cpf=new Cpf("Inválido");
	}
	
	public Usuario(String sNome, String sCpf) {
		this();
		setNome(sNome);
		setCpf(new Cpf(sCpf));
	}
	
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
