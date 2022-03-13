package com.example.controller;

import com.example.service.ViewPicsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/view")
public class ViewController {
    @Autowired
    private ViewPicsServiceImpl viewPicsService;

    @RequestMapping("/deliver")
    public ModelAndView deliver(){
        ModelAndView modelAndView = new ModelAndView();
        viewPicsService.deliver();
        return modelAndView;
    }

}
