package com.grats.BankDetailsByNumber.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grats.BankDetailsByNumber.Entity.BankDetails;
import com.grats.BankDetailsByNumber.Service.BankService;

@RestController
@RequestMapping("/bankdetails")
public class BankController {
	
	@Autowired
	private BankService bankService;

	@PostMapping("/savebank")
	public ResponseEntity<BankDetails> saveDetails(@RequestBody BankDetails bankDetails){
	return new ResponseEntity<BankDetails>(bankService.saveDetails(bankDetails),HttpStatus.CREATED);
	}
	
	@GetMapping("/accountNumber")
	public ResponseEntity<BankDetails> getByAccountNumber(@PathVariable(value = "Account Number") String accountNumber){
		return new ResponseEntity<BankDetails>(bankService.getDetails(accountNumber),HttpStatus.FOUND);
	}
}
