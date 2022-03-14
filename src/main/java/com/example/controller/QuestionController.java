package com.example.controller;

import com.example.domain.ResponseResult;
import com.example.domain.TbFoundNotice;
import com.example.domain.TbQuestions;
import com.example.service.QuestionServiceImpl;
import com.example.utils.ResponseUtils2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.List;

@Controller
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionServiceImpl questionService;

    @RequestMapping("/selectQuestions")
    @ResponseBody
    public ResponseResult<Object> list() throws Exception{
        List<TbQuestions> tbQuestionsList = questionService.findAll();
        System.out.println(tbQuestionsList);
        return ResponseUtils2.success(tbQuestionsList);
    }

    @RequestMapping(value = "/deliver",method = RequestMethod.POST)
    public ModelAndView deliver(TbQuestions tbQuestions) throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        questionService.addQuestion(tbQuestions);
        modelAndView.setViewName("/questions/selectQuestions");
        return modelAndView;
    }

    @RequestMapping("/remove/{q_id}")
    public ModelAndView removeQuestion(@PathVariable("q_id") String q_id) throws Exception {
        questionService.removeQuestion(q_id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/questions/selectQuestion");
        return modelAndView;
    }

}
