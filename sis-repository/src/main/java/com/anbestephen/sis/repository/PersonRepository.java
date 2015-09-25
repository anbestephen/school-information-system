package com.anbestephen.sis.repository;

import java.util.List;

import com.anbestephen.sis.model.Person;

public interface PersonRepository{
    
    public Person findById(Integer id);
    
    public List<Person> findAll(); 

    public void save(Person person);

    public void edit(Person person); 
  
    public void delete(Integer id); 
    
}