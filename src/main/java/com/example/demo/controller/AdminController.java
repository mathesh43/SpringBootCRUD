package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.Entity.MEMBER;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.service.ADMINService;


/**
 *
 * @author glsuser
 *
 *solve login_invalid method problem
 */
@Controller
public class AdminController {

    @Autowired
    private ADMINService adminservice;


    @Autowired
    LoginController login;
    /**
    *
    * @param member
    *            has the entity values to process.
    * @return redirect the controller to /list.
    */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String add(@ModelAttribute MEMBER member) {
        if(login.validate()==1) {

                adminservice.add(member);
                return "redirect:/list";
        }
        return "redirect:login_invalid";
    }

    /**
    *
    * @return the command as search for add file in the jsp folder.
    */

    @RequestMapping("/add")
    public String add() {

        if(login.validate()==1) {
                return "add";
           }
           return "redirect:login_invalid";



    }

    /**
    *
    * @param model
    *            object get the information from the crudservice and add object
    *            with setviewname.
    * @return the model object, that will locate the jsp file in the object.
    */

    @RequestMapping("/list")
    public ModelAndView listall(ModelAndView model) {


        if(login.validate()==1) {
        List<MEMBER> listname = adminservice.getAllName();
        model.addObject("listname", listname);
        model.setViewName("list");

        }
        else {
            model.setViewName("login_invalid");
        }

        return model;

    }

    /**
    *
    * @param id
    *            get the id from the url path.
    * @return redirect the controller to /list.
    */

    @RequestMapping(value = "delete/{id}")
    public String deleteName(@PathVariable("id") Integer id) {

        if(login.validate()==1) {
        adminservice.deleteName(id);
        return "redirect:/list";
        }
          return "login_invalid";
    }

    /**
    *
    * @param id
    *            get the id from the jsp page using request param.
    * @param model
    *            object, that will locate the jsp file in the object and set
    *            attributes.
    * @return the jsp file.
    */
    @RequestMapping("/edit")
    public String getNameById(@RequestParam(value = "id", required = false) int id, Model model) {

        if(login.validate()==1) {
        MEMBER member = adminservice.getNameById(id);
        model.addAttribute("member", member);
        return "edit";
        }
        return "login_invalid";

    }

    /**
    *
    * @param member
    *            has the entity values to process.
    * @return redirect the controller to /list.
    */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateName(@ModelAttribute MEMBER member) {

        if(login.validate()==1) {
        adminservice.updateName(member);
        return "redirect:/list";
        }
          return "login_invalid";
    }

    /**
    *
    * @param member
    *            has the entity values to process.
    * @return redirect the controller to home.
    */
    @RequestMapping("/home")
    public String home(@ModelAttribute MEMBER member) {
        if(login.validate()==1) {
            return "home";
        }
        return "login_invalid";
    }
    /**

    *
    * @param member
    *            has the entity values to process.
    * @return redirect the controller to books.
    */
    @RequestMapping("/books")
    public String books(@ModelAttribute MEMBER member) {

        if(login.validate()==1) {
            return "books";
          }
          return "login_invalid";

    }

    /**
    *
    * @param member
    *            has the entity values to process.
    * @return redirect the controller to rack.
    */
    @RequestMapping("/rack")
    public String rack(@ModelAttribute MEMBER member) {


        if(login.validate()==1) {
            return "rack";
          }
          return "login_invalid";

    }


    /**
    *
    * @param member
    *            has the entity values to process.
    * @return redirect the controller to category.
    */
    @RequestMapping("/category")
    public String category(@ModelAttribute MEMBER member) {
        if(login.validate()==1) {
            return "category";
            }
            return "error";

    }

    /**
    *
    * @param member
    *            entity.
    * @param searchkey
    *            from jsp.
    * @return model.
    */
    @RequestMapping("/search")
    public ModelAndView search(@ModelAttribute MEMBER member, @RequestParam("search") String searchkey) {

        ModelAndView model = new ModelAndView();
        if(login.validate()==1) {
        List<MEMBER> listname = adminservice.search(searchkey);
        model.addObject("listname", listname);
        model.addObject("search", true);
        model.setViewName("list");
        model.addObject("searchkey", searchkey);
        }

        else {
            model.setViewName("login_invalid");
        }
        return model;
    }


}
