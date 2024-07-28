package com.pack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.entity.Product;
import com.pack.exceptions.ProductNotFound;
import com.pack.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private final ProductRepo productRepo;
	
	public ProductService(ProductRepo productRepo) {
		this.productRepo=productRepo;
	}
	
	public Product saveProduct(Product product) {
		Product obj = productRepo.save(product);
		return obj;
	}
	public Product getProduct(int id) {
		
		return productRepo.findById(id).orElseThrow(
				() -> new ProductNotFound(String.format("ProductId %d Not Found", id))
				);
		
	}
	
	public List<Product> getAllProducts(){
		return productRepo.findAll();

	}
	
	public void deleteProductById(int id) {
		productRepo.deleteById(id);
	}
	public Product updateProduct(int id, Product product) {
		Optional<Product> optionalProduct = productRepo.findById(id);
		if(optionalProduct.isPresent()) {
			Product existedProduct = optionalProduct.get();
			existedProduct.setName(product.getName());
			existedProduct.setCost(product.getCost());
			existedProduct.setQty(product.getQty());
			
			return productRepo.save(existedProduct);
		}else {
			throw new RuntimeException("product not found with id"+id);
		}
		
	}
	public Product getByName(String name) {
		return productRepo.findByName(name);
	
	}
}
