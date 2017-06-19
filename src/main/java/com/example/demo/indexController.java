package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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
}
