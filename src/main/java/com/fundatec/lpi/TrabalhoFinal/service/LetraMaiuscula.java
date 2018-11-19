package com.fundatec.lpi.TrabalhoFinal.service;

public class LetraMaiuscula implements ValidadorNome {

	public String valida(String nome) {
		nome = nome.trim();
	
		return nome.substring(0, 1).toUpperCase().concat(nome.substring(1));
	}

}
