package com.anbestephen.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClassController {

    @RequestMapping(value = "/classs/{id}", method = RequestMethod.GET)
    public ResponseEntity<com.anbestephen.media.model.Class> findById(Integer id) {
        return null;
    }

    @RequestMapping(value = "/classs", method = RequestMethod.GET)
    public ResponseEntity<com.anbestephen.media.model.Class> findAll() {
        return null;
    }

    @RequestMapping(value = "/classs", method = RequestMethod.POST)
    public ResponseEntity<Void> save(com.anbestephen.media.model.Class assignment) {
        return null;
    }

    @RequestMapping(value = "/classs", method = RequestMethod.POST)
    public ResponseEntity<Void> edit(com.anbestephen.media.model.Class assignment) {
        return null;
    }

    @RequestMapping(value = "/classs/{id}", method = RequestMethod.GET)
    public ResponseEntity<Void> delete(Integer id) {
        return null;
    }
}
