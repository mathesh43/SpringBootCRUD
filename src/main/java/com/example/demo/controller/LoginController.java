package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author glsuser
 *
 */
@Controller
public class LoginController {

    /**
     *
     * @param username
     *            request the username from the jsp page.
     * @param password
     *            request the password from the jsp page.
     * @param request
     *            has been created for handling session.
     * @param response
     *            has been created for handling session.
     * @return it will return either home page or error page.
     */


    private HttpSession session;
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("username") String password,
            HttpServletRequest request, HttpServletResponse response) {
        if (username.equals("mathesh") && password.equals("mathesh")) {

            session = request.getSession();
            String user = (String) request.getAttribute("username");
            session.setAttribute("UserName", user);
            session.setAttribute("validate", 1);

            return "/home";
        } else {
            return "error";
        }

    }


    protected int validate() {

        return (int) session.getAttribute("validate");

    }
    /**
     *
     * @param request has been created for handling session.
     * @param response has been created for handling session.
     * @return it will return login page.
     */
    @RequestMapping(value = "logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        session.invalidate();
        return "login";
    }

}
