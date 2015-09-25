package com.anbestephen.sis.repository;

import java.util.List;

import com.anbestephen.sis.model.Teacher;

public interface TeacherRepository{
    
    public Teacher findById(Integer id);
    
    public List<Teacher> findAll(); 

    public void save(Teacher teacher);

    public void edit(Teacher teacher); 
  
    public void delete(Integer id); 
    
}