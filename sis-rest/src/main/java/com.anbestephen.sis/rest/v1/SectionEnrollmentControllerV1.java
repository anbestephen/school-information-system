package com.anbestephen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anbestephen.sis.model.SectionEnrollment;

@Controller
@RequestMapping("/v1")
public class SectionEnrollmentControllerV1 {

    @RequestMapping(value = "/sectionEnrollments/{id}", method = RequestMethod.GET)
    public SectionEnrollment findById(Integer id) {
        return null;
    }

    @RequestMapping(value = "/sectionEnrollments", method = RequestMethod.GET)
    public SectionEnrollment findAll() {
        return null;
    }

    @RequestMapping(value = "/sectionEnrollments", method = RequestMethod.POST)
    public void save(SectionEnrollment assignment) {

    }

    @RequestMapping(value = "/sectionEnrollments", method = RequestMethod.POST)
    public void edit(SectionEnrollment assignment) {

    }

    @RequestMapping(value = "/sectionEnrollments/{id}", method = RequestMethod.GET)
    public void delete(Integer id) {

    }
}
