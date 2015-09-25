package com.anbestephen.sis.repository;

import java.util.List;

import com.anbestephen.sis.model.Student;

public interface StudentRepository{
    
    public Student findById(Integer id);
    
    public List<Student> findAll(); 

    public void save(Student student);

    public void edit(Student student); 
  
    public void delete(Integer id); 
    
}