package com.anbestephen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anbestephen.media.model.Self;

@Controller
public class SelfController {

    @RequestMapping(value = "/self/", method = RequestMethod.GET)
    public Self findById(Integer id) {
        return null;
    }

}
