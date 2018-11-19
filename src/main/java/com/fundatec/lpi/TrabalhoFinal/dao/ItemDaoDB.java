package com.fundatec.lpi.TrabalhoFinal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fundatec.lpi.TrabalhoFinal.domain.Item;

public class ItemDaoDB implements BaseDao<Item> {

	private Connection conn;

	public ItemDaoDB() {
		try {
			String mysqlDriver = "com.mysql.cj.jdbc.Driver";
			Class.forName(mysqlDriver);

			String connString = "jdbc:mysql://localhost/Fundatec?user=root&password=password";
			conn = DriverManager.getConnection(connString);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void save(Item item) {

		try {
			String query = "INSERT INTO itens (nome, preco) values (?, ?)";

			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setString(1, item.getNome());
			preparedStmt.setDouble(2, item.getPreco());

			preparedStmt.execute();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public List<Item> listAll() {
		List<Item> lista = new ArrayList<Item>();

		try {
			String query = "SELECT * FROM itens";

			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				double preco = resultSet.getDouble("preco");

				Item item = new Item(id, nome, preco);
				lista.add(item);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return lista;
	}

	public void delete(int id) {
		try {
			String query = "DELETE FROM itens WHERE id = " + id;

			Statement statement = conn.createStatement();
			statement.execute(query);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void update(Item item) {

		try {
			String query = "UPDATE itens SET nome=?, preco=? WHERE id=?";

			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setString(1, item.getNome());
			preparedStmt.setDouble(2, item.getPreco());
			preparedStmt.setInt(3, item.getId());

			preparedStmt.execute();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
