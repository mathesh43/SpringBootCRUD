package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.Entity.CRUD;
import org.springframework.web.servlet.ModelAndView;
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
		crudservice.add(crud);
		return new ModelAndView("add");
	}
	@RequestMapping(value="/add",method=RequestMethod.GET) 
	public ModelAndView add_get(@ModelAttribute CRUD crud) {
		crudservice.add(crud);
		return new ModelAndView("add");
	}
	@RequestMapping("/list")
	public ModelAndView listall(ModelAndView model) {
		List<CRUD> listname = crudservice.getAllName();
		model.addObject("listname", listname);
		model.setViewName("list");
		return model;
	
	}
	
	@RequestMapping(value="delete/{id}")
	public ResponseEntity<Void> deleteName(@PathVariable("id") Integer id) {
		crudservice.deleteName(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	@GetMapping("name/{id}")
	public ResponseEntity<CRUD> getNameById(@PathVariable("id") Integer id) {
		CRUD crud = crudservice.getNameById(id);
		return new ResponseEntity<CRUD>(crud, HttpStatus.OK);
	}
	
}
