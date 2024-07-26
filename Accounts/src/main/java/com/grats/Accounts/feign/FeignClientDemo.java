package com.grats.Accounts.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(url = "http://localhost:8081", value = "Bankdetails", path = "/bankdetails")
public interface FeignClientDemo {

	@GetMapping("/accountNumber")
	feign.Response getByAccountNumber(@PathVariable(name = "Account Number") String accountNumber);
		
	
}
