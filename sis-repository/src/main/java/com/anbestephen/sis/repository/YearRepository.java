package com.anbestephen.sis.repository;

import java.util.List;

import com.anbestephen.sis.model.Year;

public interface YearRepository{
    
    public Year findById(Integer id);
    
    public List<Year> findAll(); 

    public void save(Year year);

    public void edit(Year year); 
  
    public void delete(Integer id); 
    
}