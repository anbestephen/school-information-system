package com.anbestephen.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anbestephen.sis.model.SchoolGroup;

@Controller
@RequestMapping("/v1")
public class SchoolGroupControllerV1 {

    @RequestMapping(value = "/schoolGroups/{id}", method = RequestMethod.GET)
    public ResponseEntity<SchoolGroup> findById(Integer id) {
        return null;
    }

    @RequestMapping(value = "/schoolGroups", method = RequestMethod.GET)
    public ResponseEntity<SchoolGroup> findAll() {
        return null;
    }

    @RequestMapping(value = "/schoolGroups", method = RequestMethod.POST)
    public ResponseEntity<Void> save(SchoolGroup assignment) {
        return null;
    }

    @RequestMapping(value = "/schoolGroups", method = RequestMethod.POST)
    public ResponseEntity<Void> edit(SchoolGroup assignment) {
        return null;
    }

    @RequestMapping(value = "/schoolGroups/{id}", method = RequestMethod.GET)
    public ResponseEntity<Void> delete(Integer id) {
        return null;
    }
}
