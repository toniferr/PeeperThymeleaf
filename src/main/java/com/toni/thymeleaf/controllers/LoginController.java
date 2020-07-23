package com.toni.thymeleaf.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toni.thymeleaf.comands.LoginCommand;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String showLoginForm(Model model){

        model.addAttribute("loginCommand", new LoginCommand());

        return "login";
    }

    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    public String doLogin(@Valid LoginCommand loginCommand, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "login";
        }

        return "redirect:/";
        //tamb se puede usar return "redirect:index";
    }
}