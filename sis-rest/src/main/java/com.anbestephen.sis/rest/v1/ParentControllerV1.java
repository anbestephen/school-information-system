package com.anbestephen.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anbestephen.sis.model.Parent;

@Controller
@RequestMapping("/v1")
public class ParentControllerV1 {

    @RequestMapping(value = "/parents/{id}", method = RequestMethod.GET)
    public ResponseEntity<Parent> findById(Integer id) {
        return null;
    }

    @RequestMapping(value = "/parents", method = RequestMethod.GET)
    public ResponseEntity<Parent> findAll() {
        return null;
    }

    @RequestMapping(value = "/parents", method = RequestMethod.POST)
    public ResponseEntity<Void> save(Parent assignment) {
        return null;
    }

    @RequestMapping(value = "/parents", method = RequestMethod.POST)
    public ResponseEntity<Void> edit(Parent assignment) {
        return null;
    }

    @RequestMapping(value = "/parents/{id}", method = RequestMethod.GET)
    public ResponseEntity<Void> delete(Integer id) {
        return null;
    }

}
