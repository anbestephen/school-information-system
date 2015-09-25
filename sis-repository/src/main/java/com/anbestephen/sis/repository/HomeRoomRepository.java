package com.anbestephen.sis.repository;

import java.util.List;

import com.anbestephen.sis.model.HomeRoom;

public interface HomeRoomRepository{
    
    public HomeRoom findById(Integer id);
    
    public List<HomeRoom> findAll(); 

    public void save(HomeRoom homeRoom);

    public void edit(HomeRoom homeRoom); 
  
    public void delete(Integer id); 
    
}