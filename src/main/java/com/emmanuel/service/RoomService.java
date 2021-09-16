package com.emmanuel.service;

import java.util.List;

import com.emmanuel.entity.Room;

public interface RoomService 
{
	Room saveRoom(Room entity);
	List<Room> showAllRooms();
	Room showRoomByNumber(Integer roomNumber);
	Room updateRoom(Room entity);
	void deleteRoom(Integer roomNumber);
}
