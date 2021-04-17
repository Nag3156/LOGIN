package com.rms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.model.room;
import com.rms.service.roomService;

@RestController 
public class restController {
	
	@Autowired
	private roomService service;
	
	@PostMapping("/save-room")
	@Transactional
	public String registerRoom(@RequestBody room Room) {
		service.saveMyRoom(Room);
		return "Hello "+Room.getRoomno()+ " room has Allocated";
		
	}
	
	@GetMapping("/all-rooms")
	public Iterable<room> showAllrooms(){
		return service.showAllrooms();
	}
	
	@GetMapping("/delete/{roomno}")
	public Iterable<room> deleteRoom(@PathVariable String roomno){
		return service.deleteByRoomno(roomno);
	}
	
	@GetMapping("/search/{roomno}")
	public room searchRoomno(@PathVariable String roomno) {
		return service.findByRoomno(roomno);
	}

}
