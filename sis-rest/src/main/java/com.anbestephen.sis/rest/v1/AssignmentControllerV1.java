package com.anbestephen.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anbestephen.media.model.Assignment;

@Controller
@RequestMapping("/v1")
public class AssignmentControllerV1 {

    @RequestMapping(value = "/assignments/{id}", method = RequestMethod.GET)
    public ResponseEntity<Assignment> findById(Integer id) {
        return null;
    }

    @RequestMapping(value = "/assignments", method = RequestMethod.GET)
    public ResponseEntity<Assignment> findAll() {
        return null;
    }

    @RequestMapping(value = "/assignments", method = RequestMethod.POST)
    public ResponseEntity<Void> save(Assignment assignment) {
        return null;
    }

    @RequestMapping(value = "/assignments", method = RequestMethod.POST)
    public ResponseEntity<Void> edit(Assignment assignment) {
        return null;
    }

    @RequestMapping(value = "/assignments/{id}", method = RequestMethod.GET)
    public ResponseEntity<Void> delete(Integer id) {
        return null;
    }
}
