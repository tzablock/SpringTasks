package com.spring.tasks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by tomasz on 7/2/16.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/", method = GET)
    public String home(){
        return "home";
    }
}
