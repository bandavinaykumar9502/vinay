package com.pack.testService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.pack.entity.Product;
import com.pack.repo.ProductRepo;
import com.pack.service.ProductService;

public class TestProductService {
	
	@Mock
	private ProductRepo productRepo;
	
	@InjectMocks
	private ProductService productService;
	
//	used to close all developments while using this Test class
	AutoCloseable autoCloseable;
	
	Product expectedproduct;

	@BeforeEach
	void setUp() {
		autoCloseable = MockitoAnnotations.openMocks(this);
		expectedproduct = new Product(1,"vivo",6769,76);
		
	}
	
	@AfterEach
	void tearDown() throws Exception {
		autoCloseable.close();
	}
	
	@Test
	public void testSaveProduct() {
		mock(ProductRepo.class);
		mock(Product.class);
		when(productRepo.save(expectedproduct)).thenReturn(expectedproduct);
		assertThat(productService.saveProduct(expectedproduct)).isEqualTo(expectedproduct);
	}
	
	@Test
	public void testUpdateProduct() {
		
		mock(Product.class);
		
		when(productRepo.findById(expectedproduct.getId())).thenReturn(Optional.of(expectedproduct));
		when(productRepo.save(expectedproduct)).thenReturn(expectedproduct);
		
		assertThat(productService.updateProduct(expectedproduct.getId(), expectedproduct)).isEqualTo(expectedproduct);
	}
	
	@Test
	public void testGetById() {
		mock(Product.class);
		when(productRepo.findById(expectedproduct.getId())).thenReturn(Optional.of(expectedproduct));
		assertThat(productService.getProduct(expectedproduct.getId()).getName()).isEqualTo(expectedproduct.getName());
	}
	
	@Test
	public void testGetAllProducts() {
		mock(Product.class);
		List<Product> productList = new ArrayList<>();
		productList.add(expectedproduct);
		
		when(productRepo.findAll()).thenReturn(productList);
		assertThat(productService.getAllProducts().getFirst().getName()).isEqualTo(productList.getFirst().getName());
				
	}
	
	@Test
	public void testDeleteProductById() {
		int productId = expectedproduct.getId();
		 
		when(productRepo.findById(productId)).thenReturn(Optional.of(expectedproduct));
		doNothing().when(productRepo).deleteById(productId);
		productService.deleteProductById(productId);
		verify(productRepo).deleteById(productId);
		
	}
	
	
	
}
