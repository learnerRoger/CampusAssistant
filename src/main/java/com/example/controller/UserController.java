package com.example.controller;

import com.example.domain.ResponseResult;
import com.example.domain.TbUsers;
import com.example.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.utils.ResponseUtils2;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/selectUser")
    @ResponseBody
    public ResponseResult<Object> list() throws Exception{
        List<TbUsers> tbUsersList = userServiceImpl.findAll();
//        System.out.println(tbUsersList.toString());
        return ResponseUtils2.success(tbUsersList);
    }

//    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
//    public ModelAndView addUserTest() throws Exception{
//        TbUsers tbUsers = new TbUsers();
//        tbUsers.setId_card("004");
//        tbUsers.setName("testdemos2");
//        tbUsers.setAcadmey("testdemos2");
//        tbUsers.setNick_name(("testdemos2"));
//        tbUsers.setCity("nanchangs2");
//        tbUsers.setProvince("江西3");
//        tbUsers.setAvatar_url("www.sohu.com.cn");
//        tbUsers.setGender(4);
//        ModelAndView modelAndView = new ModelAndView();
//        userServiceImpl.addUser(tbUsers);
//        modelAndView.setViewName("/user/selectUser");
//        return modelAndView;
//    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public ModelAndView addUser(TbUsers tbUsers) throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        userServiceImpl.addUser(tbUsers);
        modelAndView.setViewName("/user/selectUser");
        return modelAndView;
    }

    @RequestMapping("/delUser/{id_card}")
    public ModelAndView removeUser(@PathVariable("id_card") String id_card) throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        userServiceImpl.removeUser(id_card);
        modelAndView.setViewName("/user/selectUser");
        return modelAndView;
    }
}
