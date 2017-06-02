package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.CRUD;
import com.example.demo.service.CRUDService;


@Controller
public class CRUDController {

	@Autowired
	private CRUDService crudservice;
	@RequestMapping("/welcome")
	public String welcome() {
		
		return crudservice.hello();
	}
	
	@RequestMapping("/a")
	public String welcomE() {
		
		return crudservice.a();
	}
	
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST) 
	public ModelAndView add(@ModelAttribute CRUD crud) {
//		String firstname=path.get("firstname");
//		String lastname=path.get("lastname");
//		ModelAndView m=new ModelAndView();
//		m.setViewName("add");
//		m.addObject("firstname", firstname);
//		m.addObject("lastname", lastname);
//		return crudservice.add(m);
		
		System.out.println("controller before crudservice call*************************");
		crudservice.add(crud);
		System.out.println("controller after crudservice call*************************");
//		if(crud.getId()==0) {
//			
//			System.out.println("model*************************");
//		}
//		else {
//			System.out.println("error*************************");
//		}
		return new ModelAndView("add");
	}
	
}
