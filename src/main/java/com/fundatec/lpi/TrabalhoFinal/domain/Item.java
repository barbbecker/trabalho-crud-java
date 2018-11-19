package com.fundatec.lpi.TrabalhoFinal.domain;

//POJO
public class Item {

	private String nome;
	private double preco;
	private int id;

	public Item(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Item(int id, String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
