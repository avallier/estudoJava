package br.com.avallier.visao;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class teste {
	
	String id;

	public teste()	{
		setId("Inicialização");
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void cadastrar()	{
		
	}

}
