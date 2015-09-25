package com.anbestephen.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anbestephen.media.model.School;

@Controller
public class SchoolController {

    @RequestMapping(value = "/schools/{id}", method = RequestMethod.GET)
    public ResponseEntity<School> findById(Integer id) {
        return null;
    }

    @RequestMapping(value = "/schools", method = RequestMethod.GET)
    public ResponseEntity<School> findAll() {
        return null;
    }

    @RequestMapping(value = "/schools", method = RequestMethod.POST)
    public ResponseEntity<Void> save(School assignment) {
        return null;
    }

    @RequestMapping(value = "/schools", method = RequestMethod.POST)
    public ResponseEntity<Void> edit(School assignment) {
        return null;
    }

    @RequestMapping(value = "/schools/{id}", method = RequestMethod.GET)
    public ResponseEntity<Void> delete(Integer id) {
        return null;
    }

}
