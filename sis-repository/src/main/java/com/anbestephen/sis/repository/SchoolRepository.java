package com.anbestephen.sis.repository;

import java.util.List;

import com.anbestephen.sis.model.School;

public interface SchoolRepository{
    
    public School findById(Integer id);
    
    public List<School> findAll(); 

    public void save(School school);

    public void edit(School school); 
  
    public void delete(Integer id); 
    
}