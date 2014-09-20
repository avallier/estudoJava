package br.com.avallier;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;

@ManagedBean
public class TesteBean {
	private HtmlInputText campo;
	private HtmlCommandButton botao;
	
	public HtmlInputText getCampo() {
		return campo;
	}
	public void setCampo(HtmlInputText campo) {
		this.campo = campo;
	}
	public HtmlCommandButton getBotao() {
		return botao;
	}
	public void setBotao(HtmlCommandButton botao) {
		this.botao = botao;
	}
	
	public void testar()	{
		if (campo.isDisabled())	{
			campo.setDisabled(false);
			botao.setStyle("");
		}
		else	{
			campo.setDisabled(true);
			botao.setStyle("background-color:red; color:white");
		}
	}
}
