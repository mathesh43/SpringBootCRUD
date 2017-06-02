package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value="/add",method=RequestMethod.POST) 
	public ModelAndView add(@ModelAttribute CRUD crud) {
		System.out.println("controller before crudservice call*************************");
		crudservice.add(crud);
		System.out.println("controller after crudservice call*************************");
		return new ModelAndView("add");
	}
	
}
