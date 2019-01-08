package com.stackroute.controller;

import com.stackroute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HomeController {
    @RequestMapping(value="/")
    public String land(){

        return "login";

    }

    @RequestMapping(value = "/teja" ,method= RequestMethod.POST)
    public String checkCredentials(@ModelAttribute("user") User userObj, ModelMap map){

        map.addAttribute("userName",userObj.getUserName());
        return "index";

    }
}
