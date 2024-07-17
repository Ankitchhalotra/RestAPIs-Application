package com.ankit.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankit.rest.model.Product;
import com.ankit.rest.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service;

	@GetMapping(value="time")
	public String getTime() {
		return new java.util.Date().toString();
	}
	
	@GetMapping()
	public List<Product> getAllProduct() {
		return service.getAllProduct();
	}
	
	@GetMapping(value="{id}")
	public Product getProduct (@PathVariable ("id") int code) {
		return service.getProduct(code);
	}
	
	@PostMapping
	public Product addproduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	
	@DeleteMapping(value="{id}")
	public Product deleteProduct(@PathVariable ("id") int code) {
		return service.deleteProduct(code);
	}
}
