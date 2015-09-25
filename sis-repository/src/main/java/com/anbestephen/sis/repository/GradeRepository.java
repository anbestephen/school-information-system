package com.anbestephen.sis.repository;

import java.util.List;

import com.anbestephen.sis.model.Grade;

public interface GradeRepository{
    
    public Grade findById(Integer id);
    
    public List<Grade> findAll(); 

    public void save(Grade grade);

    public void edit(Grade grade); 
  
    public void delete(Integer id); 
    
}