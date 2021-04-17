package com.rms.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="RoomDetails")
public class room {
	
	@Id
	private int id;
	private String roomno;
	private String roomtype;
	private String checkin;
	private String checkout;
	private String status;
	
	public room() {
		
	}
	public room(int id, String roomno, String roomtype, String checkin, String checkout, String status) {
		super();
		this.id =id;
		this.roomno = roomno;
		this.roomtype = roomtype;
		this.checkin = checkin;
		this.checkout = checkout;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getRoomno() {
		return roomno;
	}
	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
