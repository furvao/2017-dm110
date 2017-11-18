package br.inatel.dm110.entities.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.inatel.dm110.entities.Product;

@Stateless
public class ProductDAO {

	@PersistenceContext(unitName = "inventory")
	private EntityManager em;

	public List<Product> list() {
		return em.createQuery("from Product p", Product.class).getResultList();
	}
	
	public void insert(Product product) {
		em.persist(product);
	}
}