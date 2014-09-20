package br.com.avallier.modelo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Usuarios {

	Map<String,Usuario> colecao;

	/**
	 * @return Retorna a lista de usuários
	 */
	public Collection<Usuario> getUsuarios() {
		return colecao.values();
	}
	
	/**
	 * Adiciona um usuário a coleção de usuários  
	 * @param usuario
	 */
	public void registra(Usuario usuario)	{
		if (usuario!=null)	{
			if (colecao.containsKey(usuario.getId()))	{
				
			}
		}
	}

	public void setUsuarios(List<Usuario> lstUsuario) {
		colecao = new HashMap<String,Usuario>();
		if (lstUsuario!=null)	{
			Iterator<Usuario> itUsu=lstUsuario.iterator();
			while (itUsu.hasNext())	{
				Usuario usu = itUsu.next();
				colecao.put(usu.getId(), usu);
			}
		}
	}

}
