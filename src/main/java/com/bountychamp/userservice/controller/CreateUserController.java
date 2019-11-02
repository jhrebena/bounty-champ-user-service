package com.bountychamp.userservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.Map;

@RestController
@EnableWebMvc
public class CreateUserController {
    @RequestMapping(path = "/create-user", method = RequestMethod.GET)
    public Map<String, String> createUser() {
        Map<String, String> out = new HashMap<>();
        out.put("create user", "needs an implementation!");
        return out;
    }
}
