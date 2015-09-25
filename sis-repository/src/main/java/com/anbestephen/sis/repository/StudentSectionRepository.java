package com.anbestephen.sis.StudentSection;

import java.util.List;

import com.anbestephen.sis.model.StudentSection;

public interface StudentSectionRepository{
    
    public StudentSection findById(Integer id);
    
    public List<StudentSection> findAll(); 

    public void save(StudentSection studentSection);

    public void edit(StudentSection studentSection); 
  
    public void delete(Integer id); 
    
}