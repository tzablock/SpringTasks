package com.spring.tasks.controller;

import com.spring.tasks.model.entity.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;


@Controller
public class HomeController {

    @RequestMapping(value = "/", method = GET)
    public ModelAndView home(){
        List<Task> tasks = new ArrayList();
        Task task = new Task();
        Task task1 = new Task();
        Task task2 = new Task();
        task.setName("cos");
        task.setText("dddsdfsfdsfd");
        task1.setName("cos1");
        task1.setText("fdggfdfgdgfdfgd");
        task2.setName("cos3");
        task2.setText("fggfgfgfsgfgfg");

        tasks.add(task);
        tasks.add(task1);
        tasks.add(task2);

        return new ModelAndView("home","tasks",tasks);
    }

}
