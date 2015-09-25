package com.anbestephen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anbestephen.media.model.Teacher;

@Controller
public class TeacherController {
  
  @RequestMapping(value="/teachers/{id}", method=RequestMethod.GET)
  public Teacher findById(Integer id){
    return null;
  }
  
  @RequestMapping(value="/teachers", method=RequestMethod.GET)
  public Teacher findAll(){
    return null;
  }
  
  @RequestMapping(value="/teachers", method=RequestMethod.POST)
  public void save(Teacher assignment){
    
  }
  
  @RequestMapping(value="/teachers", method=RequestMethod.POST)
  public void edit(Teacher assignment){
    
  }
  
  @RequestMapping(value="/teachers/{id}", method=RequestMethod.GET)
  public void delete(Integer id){
    
  }
}
