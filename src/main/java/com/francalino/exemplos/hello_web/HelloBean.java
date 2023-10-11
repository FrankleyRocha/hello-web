package com.francalino.exemplos.hello_web;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class HelloBean implements Serializable{

	private static final long serialVersionUID = -7679515335550049827L;
	
	private String msg = "Primeira mensagem!!!";

	public String getMessage() {
		return msg;
	}
	
	public String umaAcao() {
		msg = "Nova mensagem!!!";
		return "umaView";
	}
	
	public void outraAcao() {
		msg = "Lorem Ipsum!!!";
	}
	
}
