package com.anbestephen.sis.repository;

import com.anbestephen.sis.model.Self;

public interface SelfRepository{
    
    public Self findById(Integer id);
    
    public Self findAll(); 

    public void save(Self self);

    public void edit(Self self); 
  
    public void delete(Integer id); 
    
}