package com.demo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Controller
public class Hello {

   /* @RequestMapping("/hello")
    public String hello(ModelMap model){
        System.out.println("jinru");
        model.put("time", new Date());
        model.addAttribute("message","lisi");
        return "hello";
    }*/

   @RequestMapping("/hello")
   public String hello(Model model){
       System.out.println("jinru");
       model.addAttribute("name","lisi");
       return "/templates/hello";
   }
}
