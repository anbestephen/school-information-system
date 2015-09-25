package com.anbestephen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.ResponseEntity;

import com.anbestephen.sis.model.Teacher;

@Controller
@RequestMapping("/v1")
public class TeacherControllerV1 {
  
  @RequestMapping(value="/teachers/{id}", method=RequestMethod.GET)
  public ResponseEntity<Teacher> findById(Integer id){
    return null;
  }
  
  @RequestMapping(value="/teachers", method=RequestMethod.GET)
  public ResponseEntity<Teacher> findAll(){
    return null;
  }
  
  @RequestMapping(value="/teachers", method=RequestMethod.POST)
  public ResponseEntity<Void> save(Teacher assignment){
    return null;
  }
  
  @RequestMapping(value="/teachers", method=RequestMethod.POST)
  public ResponseEntity<Void> edit(Teacher assignment){
    return null;
  }
  
  @RequestMapping(value="/teachers/{id}", method=RequestMethod.GET)
  public ResponseEntity<Void> delete(Integer id){
    return null;
  }
}
