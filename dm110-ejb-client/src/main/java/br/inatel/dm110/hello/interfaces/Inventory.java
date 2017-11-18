package br.inatel.dm110.hello.interfaces;

import java.util.List;

public interface Inventory {

	public List<String> listProductNames();
	
	public void insert(String name);
}
