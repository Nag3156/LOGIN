package com.rms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.model.room;
import com.rms.repository.roomRepository;

@Service
public class roomService {
	
	@Autowired
	private roomRepository repo;
	
	public roomService() {
		
	}

	public roomService(roomRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void saveMyRoom(room Room) {
		repo.save(Room);
	}
	
	public Iterable<room> showAllrooms(){
		return repo.findAll();
	}
	
	public Iterable<room> deleteByRoomno(String roomno){
		repo.deleteByRoomno(roomno);
		return repo.findAll();
	}
	
	public room findByRoomno(String roomno) {
		return repo.findByRoomno(roomno);
	}

}
