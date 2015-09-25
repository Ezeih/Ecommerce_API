package se.sleepdev.ecommerce.service;

import se.sleepdev.ecommerce.model.Product;

public interface ProdRep {
	Product addProduct(Product product) throws RepositryException;

	Product getProduct(int productId) throws RepositryException;

	Product removeProduct(int productId) throws RepositryException;

	Product updateProduct(int productId) throws RepositryException;

}
