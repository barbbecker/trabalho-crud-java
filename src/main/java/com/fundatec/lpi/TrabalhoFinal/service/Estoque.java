package com.fundatec.lpi.TrabalhoFinal.service;

import java.util.ArrayList;
import java.util.List;

import com.fundatec.lpi.TrabalhoFinal.dao.ItemDaoDB;
import com.fundatec.lpi.TrabalhoFinal.domain.Item;

public class Estoque {

	private List<Item> itens = new ArrayList<Item>();

	public Estoque() {
		ItemDaoDB itemDao = new ItemDaoDB();
		this.itens = itemDao.listAll();
	}

	public List<Item> getItens() {
		return itens;
	}
	
	public void exibirLista() {
		ItemDaoDB itemDao = new ItemDaoDB();
		this.itens = itemDao.listAll();
		
		for(Item item : itens) {
			System.out.println(item.getId() + " - " + item.getNome() + " = " + item.getPreco());
		}
	}


	public double custoTotal() {

		ItemDaoDB itemDao = new ItemDaoDB();
		this.itens = itemDao.listAll();
		
		double custoTotal = 0;

		for (Item item : itens) {
			custoTotal = custoTotal + item.getPreco();
		}

		return custoTotal;
	}
}