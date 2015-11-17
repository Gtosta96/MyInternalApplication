package br.com.struts.action;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.com.dominio.Negociacao;
import br.com.reader.LeitorXML;
import br.com.struts.form.StrutsForm;

import com.google.gson.Gson;

public class StrutsAction extends Action {

	@SuppressWarnings("unchecked")
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	
		StrutsForm strutsForm = (StrutsForm) form;
		
		//GETTING DATA FROM WEBSERVICE PROJECT
		List<Negociacao> listaNegociacao = new LeitorXML().SAXParser(); 
		
		for (Negociacao negociacao : listaNegociacao) {
			strutsForm.setNegociacao(negociacao);
		}
		
		String listaJSON = new Gson().toJson(listaNegociacao);
		strutsForm.setListaNegociacao(listaNegociacao);
		
		//DIFFERENT WAYS TO DO IT
		request.setAttribute("listaNegociacao", listaNegociacao);
		request.setAttribute("listaJSON", listaJSON);
		boolean bool = new Random().nextBoolean();
		
		//APENAS P/ TESTAR FOWARD DE STRUTS
		if(bool){
			strutsForm.setMessage("booleano de sucesso!");
			return mapping.findForward("success");			
		}else{
			strutsForm.setMessage("booleano do erro!");
			return mapping.findForward("error");
		}
	}
}
