package com.anbestephen.sis.repository;

import java.util.List;

import com.anbestephen.sis.model.Section;

public interface SectionRepository{
    
    public Section findById(Integer id);
    
    public List<Section> findAll(); 

    public void save(Section section);

    public void edit(Section section); 
  
    public void delete(Integer id); 
    
}