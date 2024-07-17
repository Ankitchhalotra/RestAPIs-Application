package com.ankit.rest.service;

import java.util.List;

import com.ankit.rest.model.Product;

public interface ProductService {

	public Product getProduct(int code);
	public List<Product> getAllProduct();
	public Product saveProduct(Product product);
	public Product updateProduct(Product product);
	public Product deleteProduct(int code);
}
