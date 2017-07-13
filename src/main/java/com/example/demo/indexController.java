package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xu_zj on 2017/6/19.
 */
@Controller
@RequestMapping("/")
public class indexController {
    @RequestMapping("/index")
    public String getTourLists(HttpServletRequest request) {

        return "index";
    }


    @RequestMapping("/index1")
    @ResponseBody
    public String getIndex1(String t1,String t2) {
        String format = String.format("GID{%s},UID{%s}", t1, t2);
        return format;
    }

    @RequestMapping("/index2")
    @ResponseBody
    public String getIndex2(Test test) {
        String format = String.format("GID{%s},UID{%s}", test.getT1(), test.getT2());
        return format;
    }


    @RequestMapping("/index3")
    public String getIndex3(Test test, Model model,HttpServletRequest request) {
//        String format = String.format("GID{%s},UID{%s}", test.getT1(), test.getT2());
        model.addAttribute("modelKey1", "modelValue1");
        request.setAttribute("modelKey2", "modelValue2");
        return "index3";
    }

    @RequestMapping("/index4")
    public ModelAndView  getIndex4(Test test, Model model) {
        List<LearnResouce> learnList =new ArrayList<LearnResouce>();
        LearnResouce bean =new LearnResouce("官方参考文档","Spring Boot Reference Guide","http://docs.spring.io/spring-boot/docs/1.5.1.RELEASE/reference/htmlsingle/#getting-started-first-application");
        learnList.add(bean);
        bean =new LearnResouce("官方SpriongBoot例子","官方SpriongBoot例子","https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples");
        learnList.add(bean);
        bean =new LearnResouce("龙国学院","Spring Boot 教程系列学习","http://www.roncoo.com/article/detail/125488");
        learnList.add(bean);
        bean =new LearnResouce("嘟嘟MD独立博客","Spring Boot干货系列 ","http://tengj.top/");
        learnList.add(bean);
        bean =new LearnResouce("后端编程嘟","Spring Boot教程和视频 ","http://www.toutiao.com/m1559096720023553/");
        learnList.add(bean);
        bean =new LearnResouce("程序猿DD","Spring Boot系列","http://www.roncoo.com/article/detail/125488");
        learnList.add(bean);
        bean =new LearnResouce("纯洁的微笑","Sping Boot系列文章","http://www.ityouknow.com/spring-boot");
        learnList.add(bean);
        bean =new LearnResouce("CSDN——小当博客专栏","Sping Boot学习","http://blog.csdn.net/column/details/spring-boot.html");
        learnList.add(bean);
        bean =new LearnResouce("梁桂钊的博客","Spring Boot 揭秘与实战","http://blog.csdn.net/column/details/spring-boot.html");
        learnList.add(bean);
        bean =new LearnResouce("林祥纤博客系列","从零开始学Spring Boot ","http://412887952-qq-com.iteye.com/category/356333");
        learnList.add(bean);
        ModelAndView modelAndView = new ModelAndView("/index4");
        modelAndView.addObject("learnList", learnList);
        return modelAndView;
    }

}

