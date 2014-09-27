package br.com.avallier.modelo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Usuarios {

	Map<String,Usuario> colecao;
	
	public Usuarios()	{
		setColecao(null);
	}

	/**
	 * @return Retorna a lista de usuários
	 */
	public Collection<Usuario> getColecao() {
		Collection<Usuario> x=colecao.values();
		System.out.println("Entrei aqui");
		//return colecao.values();
		return x;
	}
	
	public void setColecao(List<Usuario> lstUsuario) {
		colecao = new HashMap<String,Usuario>();
		if (lstUsuario!=null)	{
			Iterator<Usuario> itUsu=lstUsuario.iterator();
			while (itUsu.hasNext())	{
				cadastrar(itUsu.next());
			}
		}
	}

	/**
	 * Adiciona um usuário a coleção de usuários  
	 * @param usuario
	 */
	public void cadastrar(Usuario usuario)	{
		if (usuario!=null)	{
			if (colecao.containsKey(usuario.getId()))	{
				
			}
			else	{
				colecao.put(usuario.getId(), usuario);
			}
		}
	}

}
