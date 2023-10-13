package com.example.demo.entity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.empDto;

@RestController
@RequestMapping("/v1/api/")
public class EmployeeController {
	
	
	
	
	@PostMapping("createEmployee")
	ResponseEntity<?> createEmp(@RequestBody empDto empdto){
		
		return new ResponseEntity<>("created user", HttpStatus.CREATED);
	}
	
	@GetMapping("getAllEmployee")
	ResponseEntity<?> getEmployee(){
		return new ResponseEntity<>("all employee", HttpStatus.OK);
	}
	
	@DeleteMapping("deleteEmpl")
	ResponseEntity<?> deleteEmpl(){
		return new ResponseEntity<>("deleted empl", HttpStatus.OK);
	}
	
	@PutMapping("updateEmp")
	ResponseEntity<?> updateEmp(@RequestBody empDto emp){
		return new ResponseEntity<>("update", HttpStatus.OK);
		
	}

}
