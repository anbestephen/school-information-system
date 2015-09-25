package com.anbestephen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anbestephen.media.model.Semester;

@Controller
public class SemesterController {

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
