package com.bountychamp.userservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.Map;

@RestController
@EnableWebMvc
public class UpdateUserController {
    @RequestMapping(path = "/update-user", method = RequestMethod.POST)
    public Map<String, String> updateUser() {
        Map<String, String> out = new HashMap<>();
        out.put("update user", "needs an implementation!");
        return out;
    }
}

