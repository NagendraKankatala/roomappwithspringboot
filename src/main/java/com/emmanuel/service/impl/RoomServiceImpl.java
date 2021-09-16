package com.emmanuel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emmanuel.entity.Room;
import com.emmanuel.repo.RoomRepo;
import com.emmanuel.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomRepo roomRepo;
	@Override
	public Room saveRoom(Room entity) {
		return roomRepo.save(entity);
	}

	@Override
	public List<Room> showAllRooms() {
		return roomRepo.findAll();
	}

	@Override
	public Room showRoomByNumber(Integer roomNumber) {
		return roomRepo.findById(roomNumber).get();
	}

	@Override
	public Room updateRoom(Room entity) {
		return roomRepo.save(entity);
	}

	@Override
	public void deleteRoom(Integer roomNumber) {
		roomRepo.deleteById(roomNumber);
	}

}
