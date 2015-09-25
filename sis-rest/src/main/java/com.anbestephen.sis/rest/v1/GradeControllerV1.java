package com.anbestephen.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anbestephen.media.model.Grade;

@Controller
@RequestMapping("/v1")
public class GradeControllerV1 {

    @RequestMapping(value = "/grades/{id}", method = RequestMethod.GET)
    public ResponseEntity<Grade> findById(Integer id) {
        return null;
    }

    @RequestMapping(value = "/grades", method = RequestMethod.GET)
    public ResponseEntity<Grade> findAll() {
        return null;
    }

    @RequestMapping(value = "/grades", method = RequestMethod.POST)
    public ResponseEntity<Void> save(Grade assignment) {
        return null;
    }

    @RequestMapping(value = "/grades", method = RequestMethod.POST)
    public ResponseEntity<Void> edit(Grade assignment) {
        return null;
    }

    @RequestMapping(value = "/grades/{id}", method = RequestMethod.GET)
    public ResponseEntity<Void> delete(Integer id) {
        return null;
    }
}
