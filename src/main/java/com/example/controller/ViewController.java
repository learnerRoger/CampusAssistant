package com.example.controller;

import com.example.service.ViewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/view")
public class ViewController {
    @Autowired
    private ViewServiceImpl viewService;

    @RequestMapping("/deliver")
    public ModelAndView deliver(){
        ModelAndView modelAndView = new ModelAndView();
        viewService.deliver();
        return modelAndView;
    }

}
