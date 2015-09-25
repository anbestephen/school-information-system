package com.anbestephen.sis.repository;

import java.util.List;

import com.anbestephen.sis.model.Role;

public interface RoleRepository{
    
    public Role findById(Integer id);
    
    public List<Role> findAll(); 

    public void save(Role role);

    public void edit(Role role); 
  
    public void delete(Integer id); 
    
}