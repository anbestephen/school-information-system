package com.anbestephen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.ResponseEntity;

import com.anbestephen.media.model.StudentSection;

@Controller
@RequestMapping("/v1")
public class StudentSectionControllerV1 {
  
  @RequestMapping(value="/studentSection/{id}", method=RequestMethod.GET)
  public ResponseEntity<StudentSection> findById(Integer id){
    return null;
  }
  
  @RequestMapping(value="/tudentSection", method=RequestMethod.GET)
  public ResponseEntity<StudentSection> findAll(){
    return null;
  }
  
  @RequestMapping(value="/tudentSection", method=RequestMethod.POST)
  public ResponseEntity<Void> save(StudentSection assignment){
    return null;
  }
  
  @RequestMapping(value="/tudentSection", method=RequestMethod.POST)
  public ResponseEntity<Void> edit(StudentSection assignment){
    return null;
  }
  
  @RequestMapping(value="/tudentSection/{id}", method=RequestMethod.GET)
  public ResponseEntity<Void> delete(Integer id){
    return null;
  }
}
