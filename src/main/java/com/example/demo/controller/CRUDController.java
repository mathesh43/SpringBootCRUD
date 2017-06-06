package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.Entity.CRUD;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.service.CRUDService;

@Controller

public class CRUDController {

	@Autowired
	private CRUDService crudservice;

	
	
	

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String add(@ModelAttribute CRUD crud) {
		crudservice.add(crud);
		return "redirect:/list";
	}

	
	@RequestMapping("/add")
	public String add() {
		return "add";
	}
	
	@RequestMapping("/list")
	public ModelAndView listall(ModelAndView model) {
		List<CRUD> listname = crudservice.getAllName();
		model.addObject("listname", listname);
		model.setViewName("list");
		return model;

	}

	@RequestMapping(value = "delete/{id}")
	public String deleteName(@PathVariable("id") Integer id) {
		crudservice.deleteName(id);
		return "redirect:/list";
	}

	@RequestMapping("/edit")
	public String getNameById(@RequestParam(value = "id", required = false) int id, Model model) {
		CRUD crud = crudservice.getNameById(id);
		model.addAttribute("crudop", crud);
		return "edit";

	}

	@RequestMapping(value="/update",method = RequestMethod.POST)
	public String updateName(@ModelAttribute CRUD crud) {
		crudservice.updateName(crud);
		return "redirect:/list";
	}
	@RequestMapping("/home")
	public String home(@ModelAttribute CRUD crud) {
		
		return "home";
	}
	@RequestMapping("/books")
	public String books(@ModelAttribute CRUD crud) {
		
		return "books";
	}
	@RequestMapping("/rack")
	public String rack(@ModelAttribute CRUD crud) {
		
		return "rack";
	}
	@RequestMapping("/category")
	public String category(@ModelAttribute CRUD crud) {
		
		return "category";
	}

}
