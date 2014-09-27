package br.com.avallier.modelo;

public class Cpf {
	
	String numero;

	public Cpf()	{
		setNumero("Inicialização");
	}
	
	public Cpf(String sNumero) {
		this();
		setNumero(sNumero);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
