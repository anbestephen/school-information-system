package com.anbestephen.sis.repository;

import java.util.List;

import com.anbestephen.sis.model.SchoolGroup;

public interface SchoolGroupRepository{
    
    public SchoolGroup findById(Integer id);
    
    public List<SchoolGroup> findAll(); 

    public void save(SchoolGroup schoolGroup);

    public void edit(SchoolGroup schoolGroup); 
  
    public void delete(Integer id); 
    
}