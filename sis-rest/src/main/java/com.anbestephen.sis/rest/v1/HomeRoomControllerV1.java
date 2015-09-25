package com.anbestephen.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anbestephen.media.model.HomeRoom;

@Controller
@RequestMapping("/v1")
public class HomeRoomControllerV1 {

    @RequestMapping(value = "/homeRooms/{id}", method = RequestMethod.GET)
    public ResponseEntity<HomeRoom> findById(Integer id) {
        return null;
    }

    @RequestMapping(value = "/homeRooms", method = RequestMethod.GET)
    public ResponseEntity<HomeRoom> findAll() {
        return null;
    }

    @RequestMapping(value = "/homeRooms", method = RequestMethod.POST)
    public ResponseEntity<Void> save(HomeRoom assignment) {
        return null;
    }

    @RequestMapping(value = "/homeRooms", method = RequestMethod.POST)
    public ResponseEntity<Void> edit(HomeRoom assignment) {
        return null;
    }

    @RequestMapping(value = "/homeRooms/{id}", method = RequestMethod.GET)
    public ResponseEntity<Void> delete(Integer id) {
        return null;
    }

}
