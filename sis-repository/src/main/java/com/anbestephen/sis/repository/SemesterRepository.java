package com.anbestephen.sis.repository;

import java.util.List;

import com.anbestephen.sis.model.Semester;

public interface SemesterRepository{
    
    public Semester findById(Integer id);
    
    public List<Semester> findAll(); 

    public void save(Semester semester);

    public void edit(Semester semester); 
  
    public void delete(Integer id); 
    
}