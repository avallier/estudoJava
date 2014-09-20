package br.com.avallier.visao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;

import br.com.avallier.modelo.Usuario;

@ManagedBean
public class UsuarioBean {

	Usuario usuario;
	
	public UsuarioBean()	{
		setUsuarios(null);
	}

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
}
