package com.ankit.rest.repo;

import org.springframework.data.repository.CrudRepository;

import com.ankit.rest.model.Product;

public interface ProductDao extends CrudRepository<Product, Integer> {

}
