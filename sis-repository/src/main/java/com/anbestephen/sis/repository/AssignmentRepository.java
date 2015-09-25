package com.anbestephen.sis.repository;

import java.util.List;

import com.anbestephen.sis.model.Assignment;

public interface AssignmentRepository{
    
    public Assignment findById(Integer id);
    
    public List<Assignment> findAll(); 

    public void save(Assignment assignment);

    public void edit(Assignment assignment); 
  
    public void delete(Integer id); 
    
}