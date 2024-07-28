package com.pack.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

	Product findByName(String name);

}
