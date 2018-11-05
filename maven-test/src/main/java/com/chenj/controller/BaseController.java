package com.chenj.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/")
    public String welcome(ModelMap model) {
        return "index";

    }

    @GetMapping("/{name}")
    @ResponseBody
    public String welcomeName(@PathVariable String name) {
        return name;

    }

}