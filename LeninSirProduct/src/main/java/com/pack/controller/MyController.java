package com.pack.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.entity.Product;
//import com.pack.payload.UserDto;
import com.pack.service.ProductService;

@RestController
@RequestMapping("/api/w1")
public class MyController {
	@Autowired
	private final ProductService productService;
	
	public MyController(ProductService productService) {
		this.productService = productService;	
	}
	@PostMapping("/insert")
	public ResponseEntity<Product> insertProduct(@RequestBody Product product){
		return new ResponseEntity<Product>(productService.saveProduct(product),HttpStatus.ACCEPTED);
//		Product obj = productService.saveProduct(product);
//		return ResponseEntity.ok(obj);
	}
//	
	@GetMapping("/getproduct/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable int id) {
		return new ResponseEntity<Product>(productService.getProduct(id),HttpStatus.OK);
	}
	@GetMapping("/getAllProducts")
	public ResponseEntity<List<Product>> getAllProducts(){
		return new ResponseEntity<List<Product>>(productService.getAllProducts(),HttpStatus.ACCEPTED);
	}
	@DeleteMapping("/deleteTheProductById/{id}")
	public ResponseEntity<Void> deleteProduct(@PathVariable int id) {
        productService.deleteProductById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product product){
		return new ResponseEntity<Product>(productService.updateProduct(id, product),HttpStatus.OK);
		
	}
	
	@GetMapping("/getbyname/{name}")
	public Product getByName(@PathVariable String name) {
		return productService.getByName(name);
		
	}
	
	
}
