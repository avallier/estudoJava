package br.com.avallier;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class beanCtrl01 {
	private String nome;
	private int valor1;
	private int valor2;
	private int valorSoma;

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getValorSoma()	{
		return valorSoma;
	}
	
	public void valorSomaCalcula()	{
		valorSoma=valor1+valor2;
	}

}
