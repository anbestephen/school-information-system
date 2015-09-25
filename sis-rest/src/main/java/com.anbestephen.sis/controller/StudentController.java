package com.anbestephen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anbestephen.media.model.Student;

@Controller
public class StudentController {
  
   @RequestMapping(value="/students/{id}", method=RequestMethod.GET)
  public Student findById(Integer id){
    return null;
  }
  
  @RequestMapping(value="/students", method=RequestMethod.GET)
  public Student findAll(){
    return null;
  }
  
  @RequestMapping(value="/students", method=RequestMethod.POST)
  public void save(Student assignment){
    
  }
  
  @RequestMapping(value="/students", method=RequestMethod.POST)
  public void edit(Student assignment){
    
  }
  
  @RequestMapping(value="/students/{id}", method=RequestMethod.GET)
  public void delete(Integer id){
    
  }
}
