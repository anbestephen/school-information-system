package com.anbestephen.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/v1")
public class ClassControllerV1 {

    @RequestMapping(value = "/classs/{id}", method = RequestMethod.GET)
    public ResponseEntity<com.anbestephen.sis.model.Class> findById(Integer id) {
        return null;
    }

    @RequestMapping(value = "/classs", method = RequestMethod.GET)
    public ResponseEntity<com.anbestephen.sis.model.Class> findAll() {
        return null;
    }

    @RequestMapping(value = "/classs", method = RequestMethod.POST)
    public ResponseEntity<Void> save(com.anbestephen.sis.model.Class assignment) {
        return null;
    }

    @RequestMapping(value = "/classs", method = RequestMethod.POST)
    public ResponseEntity<Void> edit(com.anbestephen.sis.model.Class assignment) {
        return null;
    }

    @RequestMapping(value = "/classs/{id}", method = RequestMethod.GET)
    public ResponseEntity<Void> delete(Integer id) {
        return null;
    }
}
