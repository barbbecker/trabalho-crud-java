package com.fundatec.lpi.TrabalhoFinal.dao;

import java.util.List;

public interface BaseDao<T> {

	public void save(T objeto);

	public List<T> listAll();

	public void delete(int id);

	public void update(T objeto);

	public void close();
}
