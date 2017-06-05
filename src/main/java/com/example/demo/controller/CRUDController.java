package com.example.demo.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebMvcProperties.View;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.Entity.CRUD;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.service.CRUDService;


@Controller
public class CRUDController {

	@Autowired
	private CRUDService crudservice;
	private Model model1;
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
		ModelAndView r=model.addObject("listname", listname);
		System.out.println(r+"***************8");
		model.setViewName("list");
		return model;
	
	}
	
	@RequestMapping(value="delete/{id}")
	public String deleteName(@PathVariable("id") Integer id) {
		crudservice.deleteName(id);
		return "redirect:/list";
	}
	@RequestMapping("/edit")
	public String getNameById(@RequestParam (value="id",required=false)int id,Model model) {
		CRUD crud = crudservice.getNameById(id);
		model.addAttribute("crudop",crud);
		return "edit";
		
	}	
		
	@RequestMapping("/update")
	public String updateName(@ModelAttribute CRUD crud) {
		System.out.println(crud+"***************************8");
		crudservice.updateName(crud);
		return "redirect:/list";
	}
	
}
