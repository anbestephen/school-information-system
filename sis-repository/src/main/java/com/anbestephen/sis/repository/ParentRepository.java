package com.anbestephen.sis.repository;

import java.util.List;

import com.anbestephen.sis.model.Parent;

public interface ParentRepository{
    
    public Parent findById(Integer id);
    
    public List<Parent> findAll(); 

    public void save(Parent parent);

    public void edit(Parent parent); 
  
    public void delete(Integer id); 
    
}