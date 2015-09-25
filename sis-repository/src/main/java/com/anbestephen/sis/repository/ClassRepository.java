package com.anbestephen.sis.repository;

import java.util.List;

public interface ClassRepository{
    
    public com.anbestephen.sis.model.Class findById(Integer id);
    
    public List<com.anbestephen.sis.model.Class> findAll(); 

    public void save(com.anbestephen.sis.model.Class schoolClass);

    public void edit(com.anbestephen.sis.model.Class schoolClass); 
  
    public void delete(Integer id); 
    
}