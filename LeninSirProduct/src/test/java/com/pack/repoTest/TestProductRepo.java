package com.pack.repoTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.pack.entity.Product;
import com.pack.repo.ProductRepo;

@DataJpaTest
public class TestProductRepo {
	
	@Autowired
	private ProductRepo productRepo;
	
	Product expectedProduct;

	@BeforeEach
	void setUp() {
		expectedProduct = new Product(2,"xiome",8764,43);
		productRepo.save(expectedProduct);
	}
	
	@AfterEach
	void tearDown() {
		expectedProduct = null;
		productRepo.deleteAll();
	}
	
//	to test the code in success way
	@Test
	public void TestFindByName_Found() {
		
		Product productFound = productRepo.findByName("xiome");
		
//		here we can use asserEquals and asserSame method but these compare only their reference to avoid this we need to compare each feild
		assertAll(
				() -> assertEquals(expectedProduct.getId(), productFound.getId()),
				() -> assertEquals(expectedProduct.getName(), productFound.getName()),
				() -> assertEquals(expectedProduct.getCost(), productFound.getCost()),
				() -> assertEquals(expectedProduct.getQty(), productFound.getQty())
				);
	}
	
//	to test the code in failure way
	@Test
	public void TestFindByName_NotFound() {
		
		Product productFound = productRepo.findByName("iphone");
		assertNull(productFound);
		
	}
	
}
