package com.rms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import com.rms.model.room;

public interface roomRepository extends CrudRepository<room, String>, MongoRepository<room, String>{

	public Iterable<room> deleteByRoomno(String roomno);
	public room findByRoomno(String roomno);

}
