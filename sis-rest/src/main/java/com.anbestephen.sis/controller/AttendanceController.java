package com.anbestephen.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anbestephen.media.model.Attendance;

@Controller
public class AttendanceController {

    @RequestMapping(value = "/attendances/{id}", method = RequestMethod.GET)
    public ResponseEntity<Attendance> findById(Integer id) {
        return null;
    }

    @RequestMapping(value = "/attendances", method = RequestMethod.GET)
    public  ResponseEntity<Attendance> findAll() {
        return null;
    }

    @RequestMapping(value = "/attendances", method = RequestMethod.POST)
    public  ResponseEntity<Void> save(Attendance assignment) {
        return null;
    }

    @RequestMapping(value = "/attendances", method = RequestMethod.POST)
    public  ResponseEntity<Void> edit(Attendance assignment) {
       return null;
    }

    @RequestMapping(value = "/attendances/{id}", method = RequestMethod.GET)
    public  ResponseEntity<Void> delete(Integer id) {
       return null;
    }

}
