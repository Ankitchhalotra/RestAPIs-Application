package com.ankit.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankit.rest.model.Product;
import com.ankit.rest.repo.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao dao;

	@Override
	public Product getProduct(int code) {
		Optional<Product> p = dao.findById(code);
		Product product = p.get();
		return product;
	}

	@Override
	public List<Product> getAllProduct() {
		return (List<Product>) dao.findAll();
	}

	@Override
	public Product saveProduct(Product product) {
		return dao.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return dao.save(product);
	}

	@Override
	public Product deleteProduct(int code) {
		Optional<Product> p = dao.findById(code);
		Product product = p.get();

		dao.deleteById(code);
		return product;
	}

}
