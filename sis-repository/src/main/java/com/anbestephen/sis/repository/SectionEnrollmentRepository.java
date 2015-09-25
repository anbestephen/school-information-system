package com.anbestephen.sis.repository;

import java.util.List;

import com.anbestephen.sis.model.SectionEnrollment;

public interface SectionEnrollmentRepository{
    
    public SectionEnrollment findById(Integer id);
    
    public List<SectionEnrollment> findAll(); 

    public void save(SectionEnrollment sectionEnrollment);

    public void edit(SectionEnrollment sectionEnrollment); 
  
    public void delete(Integer id); 
    
}