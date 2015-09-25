package com.anbestephen.sis.repository;

import java.util.List;

import com.anbestephen.sis.model.Attendance;

public interface AttendanceRepository{
    
    public Attendance findById(Integer id);
    
    public List<Attendance> findAll(); 

    public void save(Attendance attendance);

    public void edit(Attendance attendance); 
  
    public void delete(Integer id); 
    
}