package com.anbestephen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anbestephen.sis.model.Semester;

@Controller
@RequestMapping("/v1")
public class SemesterControllerV1 {

    @RequestMapping(value = "/semesters/{id}", method = RequestMethod.GET)
    public Semester findById(Integer id) {
        return null;
    }

    @RequestMapping(value = "/semesters", method = RequestMethod.GET)
    public Semester findAll() {
        return null;
    }

    @RequestMapping(value = "/semesters", method = RequestMethod.POST)
    public void save(Semester assignment) {

    }

    @RequestMapping(value = "/semesters", method = RequestMethod.POST)
    public void edit(Semester assignment) {

    }

    @RequestMapping(value = "/semesters/{id}", method = RequestMethod.GET)
    public void delete(Integer id) {

    }
}
