package br.com.avallier.visao;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionListener;

import br.com.avallier.modelo.Usuario;
import br.com.avallier.modelo.Usuarios;

@ManagedBean
@SessionScoped
public class UsuarioBean extends Usuario{

	private Usuario usuario;
	private Usuarios usuarios;
	
	public UsuarioBean()	{
		usuario=new Usuario("Inicialização","cpf inválido");
		usuarios=new Usuarios();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}
	
	public String cadastrar()	{
		usuarios.cadastrar(getUsuario());
		return "Usuário Cadastrado";
	}
}
