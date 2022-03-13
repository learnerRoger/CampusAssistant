package com.example.controller;

import com.example.domain.ResponseResult;
import com.example.domain.TbFoundNotice;
import com.example.domain.TbUsers;
import com.example.service.FoundNoticeServiceImpl;
import com.example.utils.ResponseUtils2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/foundNotice")
public class FoundNoticeController {

    @Autowired
    private FoundNoticeServiceImpl foundNoticeService;

    @RequestMapping("/selectFoundNotice")
    @ResponseBody
    public ResponseResult<Object> list() throws Exception{
        List<TbFoundNotice> tbFoundNoticeList = foundNoticeService.findAll();
        return ResponseUtils2.success(tbFoundNoticeList);
    }


    /**
     * 创建一个测试的foundNotice对象
     */
    public TbFoundNotice getTestFoundNotice(){
        TbFoundNotice tbFoundNotice = new TbFoundNotice();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String strBeginDate = dateFormat.format(date.getTime());
        tbFoundNotice.setFound_id("2");
        tbFoundNotice.setId_card("003");
        tbFoundNotice.setTitle("这是第二个测试title");
        tbFoundNotice.setContent("这是第二个测试content");
        tbFoundNotice.setGoods_desc("这是第二个测试的goods_desc");
        tbFoundNotice.setFound_time(Timestamp.valueOf(strBeginDate));
        tbFoundNotice.setLost_place("这是第二个测试的lost_place");
        tbFoundNotice.setContact("这是第二个测试的contact");
        tbFoundNotice.setPost_time(Timestamp.valueOf(strBeginDate));
        System.out.println(tbFoundNotice);
        return tbFoundNotice;
    }
    @RequestMapping(value = "/deliver",method = RequestMethod.POST)
    public ModelAndView deliver() throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        foundNoticeService.addFoundNotice(getTestFoundNotice());
        modelAndView.setViewName("/foundNotice/selectFoundNotice");
        return modelAndView;
    }
}
