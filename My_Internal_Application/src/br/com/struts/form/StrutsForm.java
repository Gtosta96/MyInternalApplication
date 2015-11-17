package br.com.struts.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import br.com.dominio.Negociacao;

public class StrutsForm extends ActionForm {	
	private static final long serialVersionUID = 1L;
	
	private String message;
	private Negociacao negociacao;
	private List<Negociacao> listaNegociacao;

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public Negociacao getNegociacao() {
		return negociacao;
	}

	public void setNegociacao(Negociacao negociacao) {
		this.negociacao = negociacao;
	}

	public List<Negociacao> getListaNegociacao() {
		return listaNegociacao;
	}

	public void setListaNegociacao(List<Negociacao> listaNegociacao) {
		this.listaNegociacao = listaNegociacao;
	}
}

