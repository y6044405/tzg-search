package com.gede.beatles.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gede.beatles.entity.Subject;
import com.gede.beatles.service.SubjectService;

@Controller
public class SubjectController {

    @Resource
    private SubjectService subjectService;

    @Value("#{envConfig.envConfig}")
    private String envTest;

    @RequestMapping(value = "/subject/detail")
    public String getById(Model model, Integer id) {
        Subject subject = subjectService.getById(id);
        model.addAttribute("subject", subject);
        return "subject/subjectDetail";
    }

    @RequestMapping(value = "/subject/home")
    @ResponseBody
    public Map<String, Object> subjectHome() {
        Map<String, Object> map = new HashMap<>();
        return map;
    }

    @RequestMapping(value = "/subject/envTest")
    @ResponseBody
    public Map<String, Object> envTeset() {
        Map<String, Object> map = new HashMap<>();
        System.out.println(envTest);
        map.put("env", envTest);
        return map;
    }

}
