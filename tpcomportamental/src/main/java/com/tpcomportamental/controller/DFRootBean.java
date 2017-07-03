package com.tpcomportamental.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

@ManagedBean(name = "dfRootBean")
@SessionScoped
public class DFRootBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String opcao;
	private List<String> lstA;
	private List<String> lstB;
	private List<String> lstC;
	
	@PostConstruct
	public void init(){
		lstA = new ArrayList<String>();
		lstB = new ArrayList<String>();
		lstC = new ArrayList<String>();
	}
	
	public List<String> getLstA() {
		return lstA;
	}
	public void setLstA(List<String> lstA) {
		this.lstA = lstA;
	}
	public List<String> getLstB() {
		return lstB;
	}
	public void setLstB(List<String> lstB) {
		this.lstB = lstB;
	}
	public List<String> getLstC() {
		return lstC;
	}
	public void setLstC(List<String> lstC) {
		this.lstC = lstC;
	}
	public String getOpcao() {
		return opcao;
	}

	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}

	public void abrePergunta1() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("resizable", false);
		options.put("draggable", false);
		options.put("modal", true);
		RequestContext.getCurrentInstance().openDialog("pergunta1", options, null);
		System.out.println("opção = " + opcao);
		if (opcao != null) {
			opcoes(opcao);
		}
		this.opcao = null;
	}

	public void aoRetornoDaPergunta1(SelectEvent event) {
		System.out.println("Opção: " + opcao + " " + "Ao retornar da pg 1.");
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Perfil encontrado", event.getObject().toString()));
	}


	public void abrePergunta2() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("resizable", false);
		options.put("draggable", false);
		options.put("modal", true);
		RequestContext.getCurrentInstance().openDialog("pergunta2", options, null);
		opcoes(opcao);
		this.opcao = null;
	}

	public void aoRetornoDaPergunta2(SelectEvent event) {
		System.out.println("Opção: " + opcao + " " + "Ao retornar da pg 2.");
		RequestContext.getCurrentInstance().closeDialog(event.getObject());
	}

	public void abrePergunta3() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("resizable", false);
		options.put("draggable", false);
		options.put("modal", true);
		RequestContext.getCurrentInstance().openDialog("pergunta3", options, null);
		//System.out.println("Selecionei :" + opcao);
		opcoes(opcao);
		this.opcao = null;
	}

	public void aoRetornoDaPergunta3(SelectEvent event) {
		System.out.println("Opção: " + opcao + " " + "Ao retornar da pg 3.");
		RequestContext.getCurrentInstance().closeDialog(event.getObject());
	}
	public void abrePergunta4() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("resizable", false);
		options.put("draggable", false);
		options.put("modal", true);
		RequestContext.getCurrentInstance().openDialog("pergunta4", options, null);
		//System.out.println("Selecionei :" + opcao);
		opcoes(opcao);
		this.opcao = null;
	}

	public void aoRetornoDaPergunta4(SelectEvent event) {
		System.out.println("Opção: " + opcao + " " + "Ao retornar da pg 4.");
		RequestContext.getCurrentInstance().closeDialog(event.getObject());
	}	
	public void abrePergunta5() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("resizable", false);
		options.put("draggable", false);
		options.put("modal", true);
		RequestContext.getCurrentInstance().openDialog("pergunta5", options, null);
		//System.out.println("Selecionei :" + opcao);
		opcoes(opcao);
		this.opcao = null;
	}

	public void aoRetornoDaPergunta5(SelectEvent event) {
		System.out.println("Opção: " + opcao + " " + "Ao retornar da pg 5.");
		RequestContext.getCurrentInstance().closeDialog(event.getObject());
	}	
	
	public void abrePergunta6() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("resizable", false);
		options.put("draggable", false);
		options.put("modal", true);
		RequestContext.getCurrentInstance().openDialog("pergunta6", options, null);
		//System.out.println("Selecionei :" + opcao);
		opcoes(opcao);
		this.opcao = null;
	}

	public void aoRetornoDaPergunta6(SelectEvent event) {
		System.out.println("Opção: " + opcao + " " + "Ao retornar da pg 6.");
		RequestContext.getCurrentInstance().closeDialog(event.getObject());
	}	
	
	public void abrePergunta7() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("resizable", false);
		options.put("draggable", false);
		options.put("modal", true);
		RequestContext.getCurrentInstance().openDialog("pergunta7", options, null);
		//System.out.println("Selecionei :" + opcao);
		opcoes(opcao);
		this.opcao = null;
	}

	public void aoRetornoDaPergunta7(SelectEvent event) {
		System.out.println("Opção: " + opcao + " " + "Ao retornar da pg 7.");
		RequestContext.getCurrentInstance().closeDialog(event.getObject());
	}
	
	public void abrePergunta8() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("resizable", false);
		options.put("draggable", false);
		options.put("modal", true);
		RequestContext.getCurrentInstance().openDialog("pergunta8", options, null);
	//	System.out.println("Selecionei :" + opcao);
		opcoes(opcao);
		this.opcao = null;
	}

	public void aoRetornoDaPergunta8(SelectEvent event) {
		//this.opcao = null;
		System.out.println("Opção: " + opcao + " " + "Ao retornar da pg 8.");
		RequestContext.getCurrentInstance().closeDialog(event.getObject());
	}

	public void closeDialog() {
		opcoes(opcao);
		System.out.println("Fechou o dialog 8");
		System.out.println("Total selecionado A: " + lstA.size());
		System.out.println("Total selecionado B: " + lstB.size());
		System.out.println("Total selecionado C: " + lstC.size());	
		opcao = resultado();
		RequestContext.getCurrentInstance().closeDialog(opcao);
		limparOpcoes();
	}
	public void opcoes(String opcao){		

		switch (opcao) {
		case "A":
			lstA.add(opcao);
			break;
		case "B":
			lstB.add(opcao);
			break;
		case "C":
			lstC.add(opcao);
			break;			

		default:
			break;
		}
	
	}
	public String resultado(){
		
		Character menor = null;
		String maior = null;
		String resultado = null;
		
		int a = this.lstA.size()+1;
		int b = this.lstB.size()+1;
		int c = this.lstC.size()+1;
		
		boolean igualdadeEntreDoisMaiores = false;

		
		//testa se há igualdade entre dois deles
		if (a == b && a > c) {
			igualdadeEntreDoisMaiores = true;
			menor = 'C';
		} 
		else if (b == c && b > a) {
				igualdadeEntreDoisMaiores = true;
				menor = 'A';	
		}
		else if (a == c && a > b) {
			igualdadeEntreDoisMaiores = true;
			menor = 'B';
		}	//retorna o maior entre os 3	
		else { 

			if (a > b && a > c) {
				maior = "centralizador."; //a
			} else {
				if (b > a && b > c) {
					maior = "delargador.";//b
				} else {
					maior = "de quem delega adequadamente.";//c
				}
			}
		}
		//Retorna o resultado do perfil 
		if (igualdadeEntreDoisMaiores && menor == 'C'){
			System.out.println("Igualdade entre os perfis: A e B");
			resultado = "Igualdade entre os perfis centralizador e delargador.";
			
		}else if (igualdadeEntreDoisMaiores && menor == 'A'){
			System.out.println("Igualdade entre os perfis: B e C");
			resultado = "Igualdade entre os perfis delargador e de quem delega adequadamente.";			
			
		}else if (igualdadeEntreDoisMaiores && menor == 'B'){
			System.out.println("Igualdade entre os perfis : A e C");
			resultado = "Igualdade entre os perfis centralizador e de quem delega adequadamente.";			
		}	
		else{
			System.out.println("o maior entre os 8 é o seu perfil: " + maior);
			resultado = "Parabéns, verificamos que você tem um perfil " + maior;
		}

		return resultado;
	}		

	public void limparOpcoes(){	
		
		this.lstA = new ArrayList<String>();
		this.lstB = new ArrayList<String>();
		this.lstC = new ArrayList<String>();
		
		this.opcao = null;
	}
}
