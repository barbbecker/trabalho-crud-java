package com.fundatec.lpi.TrabalhoFinal;

import java.io.IOException;
import java.util.Scanner;

import com.fundatec.lpi.TrabalhoFinal.dao.BaseDao;
import com.fundatec.lpi.TrabalhoFinal.dao.ItemDaoDB;
import com.fundatec.lpi.TrabalhoFinal.domain.Item;
import com.fundatec.lpi.TrabalhoFinal.service.Estoque;
import com.fundatec.lpi.TrabalhoFinal.service.LetraMaiuscula;
import com.fundatec.lpi.TrabalhoFinal.service.ValidadorNome;

public class App {
	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		BaseDao<Item> itemDao = new ItemDaoDB();
		Estoque estoque = new Estoque();

		int comando = 0;
		int id = 0;

		do {
			System.out.println("Sistema de Estoque - Escolha uma opção:");
			System.out.println("---------------------------------------");
			System.out.println("1 - Cadastro de item");
			System.out.println("2 - Listar item");
			System.out.println("3 - Editar item por ID");
			System.out.println("4 - Excluir item por ID");
			System.out.println("5 - Listar custo do estoque");
			System.out.println("0 - Sair");
			System.out.println("");
			System.out.print("Qual opção? ");
			comando = scanner.nextInt();
			scanner.nextLine();

			if (comando == 1) {
				System.out.println("=> Cadastro de item");
				System.out.print("=> Nome: ");
				String nome = scanner.nextLine();

				ValidadorNome validadorLetra = new LetraMaiuscula();
				nome = validadorLetra.valida(nome);

				System.out.println("=> Preço: ");
				double preco = scanner.nextDouble();

				Item item = new Item(nome, preco);
				itemDao.save(item);

			} else if (comando == 2) {
				System.out.println("=> Listagem de itens");

				estoque.exibirLista();

			} else if (comando == 3) {
				double preco;
				String nome;

				System.out.println("=> Editar item");
				System.out.println("=> ID: ");
				id = scanner.nextInt();
				scanner.nextLine();

				System.out.println("ID do item editado: " + id);

				System.out.println("=> Novo nome: ");
				nome = scanner.nextLine();
				
				ValidadorNome validadorLetra = new LetraMaiuscula();
				nome = validadorLetra.valida(nome);

				System.out.println("=> Novo preço: ");
				preco = scanner.nextDouble();

				Item item = new Item(id, nome, preco);
				itemDao.update(item);

			} else if (comando == 4) {
				System.out.println("=> Excluir item");
				System.out.println("=> ID: ");
				id = scanner.nextInt();
				scanner.nextLine();
				
				itemDao.delete(id);

			} else if (comando == 5) {
				estoque.exibirLista();
				System.out.println("=> Total do estoque");

				System.out.println("Total do Estoque: " + estoque.custoTotal());

			} else if (comando == 0) {
				System.out.println("=> Saindo...");

			} else {
				System.out.println("Comando inválido!");

			}

		} while (comando != 0);
		
		itemDao.close();
		scanner.close();
	}
}
