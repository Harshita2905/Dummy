package com.example.demo.controller;

import java.security.PublicKey;
import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController

@RequestMapping("/swagger")
public class ActivityController {

	List<Product> list = new LinkedList<>();
	
	
	@GetMapping("/index")
	public String index() {
		return "you are on index page";
		
	}
	
	@GetMapping("/getData")
	public List<Product> getData() {
		
//		list.add(new Product(1,"chips"));
//		list.add(new Product(2,"biscuit"));
		
		return list;
	}
	
	@PostMapping("/addData")
	public List<Product> addData(@RequestBody int id,String name){
		
		list.add(new Product(id,name));
		return list;
	}
	
}
