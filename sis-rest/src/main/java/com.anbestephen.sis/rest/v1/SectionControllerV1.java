package com.anbestephen.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anbestephen.media.model.Section;

@Controller
@RequestMapping("/v1")
public class SectionControllerV1 {

    @RequestMapping(value = "/sections/{id}", method = RequestMethod.GET)
    public ResponseEntity<Section> findById(Integer id) {
        return null;
    }

    @RequestMapping(value = "/sections", method = RequestMethod.GET)
    public ResponseEntity<Section> findAll() {
        return null;
    }

    @RequestMapping(value = "/sections", method = RequestMethod.POST)
    public ResponseEntity<Void> save(Section assignment) {
        return null;
    }

    @RequestMapping(value = "/sections", method = RequestMethod.POST)
    public ResponseEntity<Void> edit(Section assignment) {
        return null;
    }

    @RequestMapping(value = "/sections/{id}", method = RequestMethod.GET)
    public ResponseEntity<Void> delete(Integer id) {
        return null;
    }

}
