package br.inatel.dm110.beans;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.dm110.entities.Product;
import br.inatel.dm110.entities.dao.ProductDAO;
import br.inatel.dm110.hello.interfaces.Inventory;
import br.inatel.dm110.hello.interfaces.InventoryLocal;
import br.inatel.dm110.hello.interfaces.InventoryRemote;

@Stateless
@Local(InventoryLocal.class)
@Remote(InventoryRemote.class)
public class InventoryBean implements Inventory {

	@EJB
	private ProductDAO productDAO;

	@Override
	public List<String> listProductNames() {

		return productDAO.list().stream().map(Product::getName).collect(Collectors.toList());
	}

	@Override
	public void insert(String name) {
		System.out.println(name);
		Product product = new Product();
		product.setName(name);
		product.setQuantity(0);
		productDAO.insert(product);
		
	}

}
