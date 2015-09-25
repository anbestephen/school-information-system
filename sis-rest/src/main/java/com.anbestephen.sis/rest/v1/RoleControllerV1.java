package com.anbestephen.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.ResponseEntity;

import com.anbestephen.media.model.Role;

@Controller
@RequestMapping("/v1")
public class RoleControllerV1 {
  
  @RequestMapping(value="/roles/{id}", method=RequestMethod.GET)
  public ResponseEntity<Role> findById(Integer id){
    return null;
  }
  
  @RequestMapping(value="/roles", method=RequestMethod.GET)
  public ResponseEntity<List<Role>> findAll(){
    return null;
  }
  
  @RequestMapping(value="/roles", method=RequestMethod.POST)
  public ResponseEntity<Void> save(Role assignment){
    return null;
  }
  
  @RequestMapping(value="/roles", method=RequestMethod.POST)
  public ResponseEntity<Void> edit(Role assignment){
    return null;
  }
  
  @RequestMapping(value="/roles/{id}", method=RequestMethod.GET)
  public ResponseEntity<Void> delete(Integer id){
    return null;
  }
}
