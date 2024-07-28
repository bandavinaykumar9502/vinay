package com.pack.controllerTest;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.pack.controller.MyController;
import com.pack.entity.Product;
import com.pack.service.ProductService;


@WebMvcTest(MyController.class)
public class TestMyController {
	
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ProductService productService;
	
	Product expectedProductOne;
	Product expectedProductTwo;
	List<Product> productList = new ArrayList<>();
	
	@BeforeEach
	void setUp() {
		expectedProductOne = new Product(1,"vivo",76767,54);
		expectedProductTwo = new Product(2,"iPhone",143434,87);
		productList.add(expectedProductOne);
		productList.add(expectedProductTwo);
		
	}
	
	@AfterEach
	void tearDown() {
		productList.clear();
	}
	
	@Test
	public void testGetProduct () throws Exception {
		
		when(productService.getProduct(expectedProductOne.getId())).thenReturn(expectedProductOne);
		mockMvc.perform(get("/api/w1/getproduct/1")).andDo(print()).andExpect(status().isOk());
		
	}
	
	@Test
	public void testGetbyName() throws Exception {
		when(productService.getByName(expectedProductOne.getName())).thenReturn(expectedProductOne);
		mockMvc.perform(get("/api/w1/getbyname/vivo")).andDo(print()).andExpect(status().isOk());
	}
	
	@Test
	public void testGetAllProducts() throws Exception {
		when(productService.getAllProducts()).thenReturn(productList);
		mockMvc.perform(get("/api/w1/getAllProducts")).andDo(print()).andExpect(status().isAccepted());
	}
	
	@Test
	public void testDeleteProductById() throws Exception {
		int productId = expectedProductOne.getId();
		
		doNothing().when(productService).deleteProductById(productId);
		mockMvc.perform(delete("/api/w1/deleteTheProductById/1")).andDo(print()).andExpect(status().isNoContent());
		verify(productService).deleteProductById(productId);
	}
	
	@Test
	public void testInsertProduct() throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
		String requestJson = ow.writeValueAsString(expectedProductOne);
		
		when(productService.saveProduct(expectedProductOne)).thenReturn(expectedProductOne);
		mockMvc.perform(post("/api/w1/insert").contentType(MediaType.APPLICATION_JSON)
				.content(requestJson)).andDo(print()).andExpect(status().isAccepted());
		
	}
	
	@Test
	void testUpdateProduct() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
		String requestJson = ow.writeValueAsString(expectedProductOne);
		
		when(productService.updateProduct(expectedProductOne.getId(), expectedProductOne)).thenReturn(expectedProductOne);
		mockMvc.perform(put("/api/w1/update/1").contentType(MediaType.APPLICATION_JSON)
				.content(requestJson)).andDo(print()).andExpect(status().isOk());
	}
	
}
