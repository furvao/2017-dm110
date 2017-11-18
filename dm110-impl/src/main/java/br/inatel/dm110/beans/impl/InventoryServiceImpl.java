package br.inatel.dm110.beans.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.dm110.hello.api.InventoryService;
import br.inatel.dm110.hello.interfaces.InventoryRemote;

@RequestScoped
public class InventoryServiceImpl implements InventoryService {

	@EJB(lookup = "java:app/dm110-ejb-0.1-SNAPSHOT/InventoryBean!br.inatel.dm110.hello.interfaces.InventoryRemote")
	private InventoryRemote inventoryRemote;

	@Override
	public List<String> list() {
		System.out.println(inventoryRemote);
		return inventoryRemote.listProductNames();
	}

	@Override
	public void insert(String name) {
		inventoryRemote.insert(name);

	}

}
